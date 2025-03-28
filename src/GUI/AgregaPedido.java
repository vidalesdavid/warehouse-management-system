/*
 * Luis David Vidales Ramirez 183060
 * Universidad Politecnica de San Luis Potosi
 */
package GUI;
//GIL, FRANKIL

import BaseDeDatos.ConsultaPedidoTabla;
import BaseDeDatos.Funciones;
import Validaciones.Validaciones;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *Frame para agregar Pedidos
 * @author Luis David Vidales Ramírez, 183060
 */
public class AgregaPedido extends javax.swing.JFrame {
private final Connection con;
  private  ConsultaPedidoTabla obj;
 private Funciones func= new Funciones();
 private Validaciones val= new Validaciones();
    /**
     * Agregar Pedido
     * Creates new form Menu
     */
 /**
  * Constructor
  * @param con Conexión
  * @throws SQLException Puede lanzar excepciones SQL 
  */
    public AgregaPedido(Connection con)throws SQLException {
        this.con=con;
        obj=new ConsultaPedidoTabla(con);
        initComponents();
            func.comboId(con, "cliente", "idCliente", comboId);
              this.tabla.setModel(obj.getModelo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        comboId = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(280, 100));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logop.jpg"))); // NOI18N
        jLabel1.setText("labelLogo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 30, 50, 30);

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setText("Almacén PoliLinea");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(350, 30, 140, 30);

        btnRegistrarCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCliente);
        btnRegistrarCliente.setBounds(40, 270, 100, 30);

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setText("Registro de Pedido");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 30, 170, 30);

        btnRegresar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar);
        btnRegresar.setBounds(220, 40, 90, 30);

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel7.setText("Id del Cliente");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 90, 120, 30);

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel8.setText("Total");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 170, 120, 30);

        txttotal.setBackground(new java.awt.Color(238, 238, 238));
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        jPanel1.add(txttotal);
        txttotal.setBounds(40, 210, 90, 22);

        jPanel1.add(comboId);
        comboId.setBounds(40, 130, 72, 22);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pedido", "Estado", "Total", "ID Cliente"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 90, 360, 220);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 570, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/og.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 590, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // ELBUENO
        String idcliente=(String) comboId.getSelectedItem();
        String total=txttotal.getText();
        boolean vali=false;
        vali=val.ValidaTotal(total);
        if(vali){
             String registro="insert into pedido ( estado, total, idCliente) VALUES('"
                          +"Activo"+"','"+total+"','"+idcliente+"')";
       
     
       
         try{
              Statement insertar = con.createStatement();
                  insertar.executeUpdate(registro);
                   JOptionPane.showMessageDialog(null, "Pedido registrado");
  
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
               JOptionPane.showMessageDialog(null, "No se pudo generar el registro");
            }
        }
        try {
          obj=new ConsultaPedidoTabla(con);
      } catch (SQLException exp) {
          Logger.getLogger(EliminaCliente.class.getName()).log(Level.SEVERE, null, exp);
      }
          tabla.setModel(obj.getModelo());
      //txtid.setText(id+"");
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
           
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    /**
     * metodo run
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}

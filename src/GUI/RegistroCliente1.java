/*
 * Luis David Vidales Ramirez 183060
 * Universidad Politecnica de San Luis Potosi
 */
package GUI;
//GIL, FRANKIL

import BaseDeDatos.ConsultaClienteTabla;
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
 *Frame para registrar clientes
 * @author Luis David Vidales Ramírez, 183060
 */
public class RegistroCliente1 extends javax.swing.JFrame {
private final Connection con;
private Validaciones valida= new Validaciones();
  private ConsultaClienteTabla obj;
    /**
     * Registrar Cliente
     * Creates new form Menu
     */
  /**
   * Constructor
   * @param con Conexión
   * @throws SQLException  Puede lanzar excepciones SQL  
   */
    public RegistroCliente1(Connection con)throws SQLException {
        this.con=con;
        obj=new ConsultaClienteTabla(con);
        initComponents();
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
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
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
        jLabel1.setBounds(220, 30, 50, 30);

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setText("Almacén PoliLinea");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 30, 140, 30);

        btnRegistrarCliente.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnRegistrarCliente.setText("Agregar");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCliente);
        btnRegistrarCliente.setBounds(50, 300, 100, 30);

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setText("Registro de Cliente");
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
        btnRegresar.setBounds(450, 30, 90, 30);

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel7.setText("Nombre del Cliente");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 90, 120, 30);

        txtNombre.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.add(txtNombre);
        txtNombre.setBounds(40, 130, 120, 22);

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel8.setText("Teléfono");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 160, 120, 30);

        txtTel.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.add(txtTel);
        txtTel.setBounds(40, 190, 120, 22);

        txtEmail.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(40, 260, 120, 22);

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel10.setText("Correo Electrónico");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 230, 120, 30);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Teléfono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 90, 360, 220);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 570, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/og.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 590, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // ELBUENO
        //boolean valida=false;
      
        String nombre=txtNombre.getText();
        String email=txtEmail.getText();
        String telefono=txtTel.getText();
        if(nombre.isBlank() || email.isBlank() || telefono.isBlank()){
            JOptionPane.showMessageDialog( null, "Debes llenar todos los campos");
        }else{
            if(nombre.length()<20 && email.length()<20 && telefono.length()<20){
                
            
                    if(valida.validaTelefono(telefono) && valida.validaEmail(email)){


                     String registro="insert into cliente (nombre, telefono, email) VALUES('"
                                  +nombre+"','"+telefono+"','"+email+"')";

                 try{
                      Statement insertar = con.createStatement();
                          insertar.executeUpdate(registro);
                          JOptionPane.showMessageDialog(null, "Cliente registrado");
                //txtid.setText(id+"");
                }catch(SQLException ex ){
                    System.out.println(ex.getNextException());
                    JOptionPane.showMessageDialog(null, "No se pudo generar el registro");
                     }
                    }else{}   
            }else{
                 JOptionPane.showMessageDialog(null, "Ningun campo debe exceder los 20 caracteres");
            }
            
        
        }
         try {
          obj=new ConsultaClienteTabla(con);
      } catch (SQLException exp) {
          Logger.getLogger(EliminaCliente.class.getName()).log(Level.SEVERE, null, exp);
      }
          tabla.setModel(obj.getModelo());
   
       
      
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
           
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * Metodo run
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}

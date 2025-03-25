/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package reportes;

import BaseDeDatos.ClienteLBD;
import BaseDeDatos.PedidoLBD;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.encoders.EncoderUtil;
import org.jfree.chart.encoders.ImageFormat;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *Clase que genera un pdf con un grafico
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class pedidoGrafico {
    private final PedidoLBD obj;
    private int i;
    /**
     * Constructor 
     * @param obj Objeto de tipo lista de base de datos de Pedido
     */
    public pedidoGrafico(PedidoLBD obj){
        this.obj=obj;
        this.i=0;
    }
    /**
     * Metodo para crear el pdf con el gráfico
     * @param nombre Bombre
     * @throws IOException Excepcion
     */
    public void crearGrafico(String nombre) throws IOException{
        Document document = new Document();
        File path= new File("src/archivos/",nombre);
        
        try{
             PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            PdfContentByte cb= writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight() );
            
            ImageIcon logo = new ImageIcon(getClass().getResource("/img/logo.jpg"));
            g.drawImage(logo.getImage(), 30, 0, 50,50, null);
            
            Font font6= new Font("Tahoma", Font.BOLD + Font.ITALIC, 10);
            g.setFont(font6);
            g.setColor(Color.BLACK);
            g.drawString("Almacen PoliLinea", 230, 10);
            
            Font font1= new Font("Tahoma",Font.BOLD+Font.ITALIC,35);
            g.setFont(font1);
            g.setColor(Color.black);
            g.drawString("Grafico de pedidos", 130, 60);
            
              ImageIcon img1= new ImageIcon(getClass().getResource("/img/og.jpg"));
            g.drawImage(img1.getImage(), 100, 100, 400,400,null);
            
            Font fontfinal=new Font("Tahoma",Font.BOLD+ Font.ITALIC,10);
            g.setFont(fontfinal);
            g.setColor(Color.BLACK);
            g.drawString("Almacen Polilinea | Grafico de Pedidos Entregados",150,750);
            
            do{
                document.newPage();
                
                  ImageIcon logo2 = new ImageIcon(getClass().getResource("/img/logo.jpg"));
                g.drawImage(logo2.getImage(), 30, 0, 50,50,null);
                /*
                Font font7=new Font("Tahoma",Font.BOLD+Font.ITALIC,10);
                g.setFont(font7);
                g.setColor(Color.BLACK);
                g.drawString("Universidad Politecnica de San luis Potosi",230,10);
                /*
               Font font8= new Font("Tahoma",Font.BOLD+Font.ITALIC,35);
                g.setFont(font8);
                g.setColor(Color.red);
                g.drawString("Lenguaje JAVA POO", 130, 60);
                */
                /*
                Font font4= new Font("Tahoma",Font.BOLD+Font.ITALIC,20);
                g.setFont(font4);
                g.setColor(Color.green);
                g.drawString("Entidad Cliente Consulta General", 100, 100);
                */
                Font font3= new Font("Tahoma",Font.ROMAN_BASELINE+ Font.ITALIC,15);
                g.setFont(font3);
                g.setColor(Color.black);
                
                //revisar base de datos
         
                int entregados=0;
                int noentregados=0;

                while(i<obj.getLista().size() ){
                    if(obj.getLista().get(i).get(1).equals("Entregado")){
                         entregados++;
                    }else{
                        noentregados++;
                    }
                  
                   i++;
                
                }
                
                 
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Entregados", new Double(entregados));
        dataset.setValue("No entregados", new Double(noentregados));
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Estado de Pedidos",   // Título del gráfico
            dataset,         // Datos
            true,            // Leyenda
            true,            // Tooltips
            false            // URLs
        );
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}: {1}"));
        int width = 500;
        int height = 400;
        java.awt.image.BufferedImage bufferedImage = chart.createBufferedImage(width, height);

        // Insertar el gráfico en el documento PDF
        Image image = Image.getInstance(EncoderUtil.encode(bufferedImage, ImageFormat.PNG, 1));
        document.add(image);
        
            Font font4= new Font("Tahoma",Font.ROMAN_BASELINE+ Font.ITALIC,15);
                g.setFont(font4);
                g.setColor(Color.black);
                
                
                
                
              
               
                
                Font fontfinal2= new Font("Tahoma",Font.BOLD + Font.ITALIC,10);
                g.setFont(fontfinal2);
                g.setColor(Color.black);
                g.drawString("Luis David Vidales Ramírez 183060@upslp.edu.mx",150,750);  
            }while(i<obj.getLista().size());
            
        } catch(DocumentException | FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        
        document.close();
        
        //JOptionPane.showMessageDialog(null, "Se creo el archivo en el paquete archivos");
        //try{
          //  Desktop.getDesktop().open(path);
        //}catch(IOException ex){
        //}
    }
}

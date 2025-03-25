/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 */
package reportes;

import BaseDeDatos.ClienteLBD;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import java.awt.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *Clase para generar un pdf de la estructura cliente
 * @author Luis David Vidales Ramírez, 183060, 183060@upslp.edu.mx
 */
public class clientePdf {
     private final ClienteLBD obj;
    private int i;
    /**
     * Constructor
     * @param obj Objeto de tipo lista de base de datos de Cliente
     */
    public clientePdf(ClienteLBD obj){
        this.obj=obj;
        this.i=0;
    }
    /**
     * Metodo para generar un pdf con consulta a los clientes de la base de datos
     * @param nombre Nombre del documento
     */
    public void pdfPersona(String nombre){
        Document document = new Document();
        File path= new File("src/archivos/",nombre);
        
        try{
            PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            PdfContentByte cb= writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight() );
            
            ImageIcon logo = new ImageIcon(getClass().getResource("/img/logo.jpg"));
            g.drawImage(logo.getImage(), 30, 0, 50,90, null);
            
              Font font6= new Font("Tahoma", Font.BOLD + Font.ITALIC, 10);
            g.setFont(font6);
            g.setColor(Color.BLACK);
            g.drawString("Almacen PoliLinea", 230, 10);
            
            Font font1= new Font("Tahoma",Font.BOLD+Font.ITALIC,35);
            g.setFont(font1);
            g.setColor(Color.black);
            g.drawString("Consulta Cliente", 130, 60);
            
            ImageIcon img1= new ImageIcon(getClass().getResource("/img/og.jpg"));
            g.drawImage(img1.getImage(), 100, 100, 400,400,null);
            
            Font fontfinal=new Font("Tahoma",Font.BOLD+ Font.ITALIC,10);
            g.setFont(fontfinal);
            g.setColor(Color.BLACK);
            g.drawString("Almacen Polilinea | Consulta Clientes",150,750);
            
            do{
                document.newPage();
                
                ImageIcon logo2 = new ImageIcon(getClass().getResource("/img/logo.jpg"));
                g.drawImage(logo2.getImage(), 30, 0, 50,90,null);
                
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
                Font font4= new Font("Tahoma",Font.BOLD+Font.ITALIC,20);
                g.setFont(font4);
                g.setColor(Color.black);
                g.drawString("Entidad Cliente Consulta General", 130, 60);
                
                Font font3= new Font("Tahoma",Font.ROMAN_BASELINE+ Font.ITALIC,15);
                g.setFont(font3);
                g.setColor(Color.black);
                int y=140;
                int x=100;
                int cont=0;
                while(i<obj.getLista().size() && cont<6){
                   g.drawString("Id "+obj.getLista().get(i).get(0).toString(),x,y);
                   y+=20;
                   g.drawString("Nombre "+obj.getLista().get(i).get(1).toString(),x,y);
                   y+=20;
                   g.drawString("Telefono "+obj.getLista().get(i).get(2).toString(),x,y);
                   y+=20;
                     g.drawString("Email "+obj.getLista().get(i).get(3).toString(),x,y);
                   y+=50;
                   i++;
                   cont++;
                }
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
       // try{
        //    Desktop.getDesktop().open(path);
        //}catch(IOException ex){
       // }
    }
}

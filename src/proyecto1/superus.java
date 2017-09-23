/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author EMILY_COYOY
 */
public class superus extends JFrame{
    private JPanel contentPane;
    private JButton Agregar;
    private JPanel contentPane1;
    private JButton salir;
    
    private JButton mostrar;
    
    
    
    public Cliente cliente[] = new Cliente[500];
     public superus(){
        init_Component();
    }
    
    
    private void init_Component(){
        
        setSize(300,300);//1550,770
        setTitle("SIBE");
        
        this.getContentPane().setBackground(Color.GRAY);
        
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setResizable(false);
        
        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        
        setLocationRelativeTo(null);
        

        
        Agregar = new JButton("Agregar Clientes");
        Agregar.setSize(150,50);
        Agregar.setLocation(70,20);
        Agregar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent evt) {
	            Agregar(evt);
	        }
	    });
        contentPane.add(Agregar);
        
        salir = new JButton("Logout");
        salir.setSize(150,50);
        salir.setLocation(70,110);
        salir.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent evt) {
	            salir(evt);
	        }
	    });
        contentPane.add(salir);
        
        mostrar = new JButton("Mostrar Clientes");
        mostrar.setSize(150,50);
        mostrar.setLocation(70,200);
        mostrar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent evt) {
	            mostrarCLiente(evt);
	        }
	    });
        contentPane.add(mostrar);
        
        
    }
    public void Agregar(ActionEvent evt){
        for(int i=0; i<500; i++){
			if(cliente[i]==null){
				Cliente c = new Cliente();
				cliente[i] = c;
				new Add_Cliente(c).show();
				
				
				break;
			}
		
		}
    }
    public void salir(ActionEvent evt){
        this.dispose();
    }
    
     private void mostrarCLiente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombreReporte;
        File reporte;
        FileWriter fw;
        BufferedWriter br;
        String cadenaHTML;
        
        try {            
            nombreReporte = "reporte.html";
            reporte = new File(nombreReporte);
            fw = new FileWriter(reporte);
            br = new BufferedWriter(fw);
            
            cadenaHTML = "<html>"
                    + "    <head>"
                    + "    <body>"
                    + "        <table border = 2>"
                    + "            <tr>"
                    + "                <td>Nombre</td>"
                    + "                <td>Usuario</td>"
                    + "                <td>Saldo Inicial (Q.)</td>"
                    + "            </tr>";
                    
            
            
            for(int x = 0; x < cliente.length; x++){
                if(cliente[x] != null){
                    cadenaHTML +=  "            <tr>"
                    + "                <td>" + cliente[x].nombre + "</td>"
                    + "                <td>" + cliente[x].user+ "</td>"
                    + "                <td>" + cliente[x].SaldoInicial+ "</td>"     
                    + "            </tr>";
                }
            }
            
            cadenaHTML += "        </table>"
                        + "    </body>"
                        + "</html>";
            
            br.write(cadenaHTML);
            
            br.close();
            fw.close();
            
            crearPdf(cadenaHTML);
            
        } catch (IOException ex) {
            System.out.println("error escribiendo el reporte. Detalles " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void crearPdf(String html){
        try{
            
                Document document = new Document(PageSize.LETTER);
                PdfWriter.getInstance(document, new FileOutputStream("reporte.pdf"));

                document.open();
                document.addAuthor("IPC1 E");
                document.addCreator("IPC1 E");
                document.addSubject("Ejemplo Reporte PDF");
                document.addCreationDate();
                document.addTitle("Reporte pdf");

                HTMLWorker htmlWorker = new HTMLWorker(document);
                htmlWorker.parse(new StringReader(html));

                document.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

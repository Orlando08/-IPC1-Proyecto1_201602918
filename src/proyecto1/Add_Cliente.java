/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/**
 *
 * @author EMILY_COYOY
 */


public class Add_Cliente extends JFrame{


		/*
	        Lista de componentes a utilizar
	    */
	    private JPanel contentPane;
	    private JLabel label_Nombre;
	    private JLabel label_Usuario;   
            private JLabel label_Contraseña;
            private JLabel label_SaldoInicial;
            private JLabel label_MontoMaximo;
	    
	    private JTextField text_field_Nombre;
	    private JTextField text_field_Usuario;
            private JTextField text_field_Contraseña;
            private JTextField text_field_SaldoInicial;
            private JTextField text_field_MontoMaximo;
	    
	    
	    private JButton button_salir;
	    private JButton button_aceptar;
	    
            
            
	    public Cliente nuevoC;
	    public Add_Cliente(Cliente C)
	    {
	        init_Component(C);
	    }
	    
	    private void init_Component(Cliente C)
	    {
	        
	        nuevoC = C;
	        
	        
	        System.out.println(C);
	        System.out.println(nuevoC);
	        
	        
	        setSize(350, 450);
	        setTitle("Ingreso de clientes");
	        
	        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        /*
	          Panel Pricipal 
	        */
	        contentPane = (JPanel) this.getContentPane();
	        contentPane.setLayout(null);
	        contentPane.setSize(350, 450);
	        
	        
	        
	        
	        /*
	        Nombre: [               ]
	        */
	        
	        label_Nombre = new JLabel("Nombre:" , JLabel.CENTER);
	        
	        label_Nombre.setSize(80, 30);
	        label_Nombre.setLocation(05, 20);
	        contentPane.add(label_Nombre);
	        
	        
	        text_field_Nombre = new JTextField();
	        text_field_Nombre.setSize(120, 25);
	        text_field_Nombre.setLocation(150, 20);
	        contentPane.add(text_field_Nombre);
	        
	        
	        
	        /*
	        Usuario: [               ]
	        */
	        
	        label_Usuario= new JLabel("Usuario:" , JLabel.CENTER);
	        
	        label_Usuario.setSize(80, 30);
	        label_Usuario.setLocation(10, 80);
	        contentPane.add(label_Usuario);
	        
	        
	        text_field_Usuario = new JTextField();
	        text_field_Usuario.setSize(120, 25);
	        text_field_Usuario.setLocation(150, 80);
	        contentPane.add(text_field_Usuario);
	      	
                label_Contraseña= new JLabel("Contraseña:" , JLabel.CENTER);
	        
	        label_Contraseña.setSize(80, 30);
	        label_Contraseña.setLocation(10, 140);
	        contentPane.add(label_Contraseña);
                
                text_field_Contraseña = new JTextField();
	        text_field_Contraseña.setSize(120, 25);
	        text_field_Contraseña.setLocation(150, 140);
	        contentPane.add(text_field_Contraseña);
                
                label_SaldoInicial= new JLabel("Saldo Inicial:" , JLabel.CENTER);
	        
	        label_SaldoInicial.setSize(80, 30);
	        label_SaldoInicial.setLocation(10, 200);
	        contentPane.add(label_SaldoInicial);
                
                text_field_SaldoInicial = new JTextField();
	        text_field_SaldoInicial.setSize(120, 25);
	        text_field_SaldoInicial.setLocation(150, 200);
	        contentPane.add(text_field_SaldoInicial);
                
                label_MontoMaximo= new JLabel("Monto Maximo:" , JLabel.CENTER);
	        
	        label_MontoMaximo.setSize(100, 30);
	        label_MontoMaximo.setLocation(10, 260);
	        contentPane.add(label_MontoMaximo);
                
                text_field_MontoMaximo = new JTextField();
	        text_field_MontoMaximo.setSize(120, 25);
	        text_field_MontoMaximo.setLocation(150, 260);
	        contentPane.add(text_field_MontoMaximo);
	        /*
	        (Aceptar)
	        */
	        button_aceptar = new JButton("Agregar");
	        button_aceptar.setSize(100, 30);
	        button_aceptar.setLocation(110,340);
	         button_aceptar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                ButtonAceptar(evt);
	                
	                
	                 
	            }
	        });
	        contentPane.add(button_aceptar);
	     

	        }
            
	     private void ButtonAceptar(ActionEvent evt)
	    {
	     String N, usuario, contraseña, saldoinicial, montomaximo;
		        /*Agregar a la lista de Clientes*/
		               N = text_field_Nombre.getText(); 
		               usuario = text_field_Usuario.getText();
                               contraseña = text_field_Contraseña.getText();
                               saldoinicial = text_field_SaldoInicial.getText();
                               montomaximo = text_field_MontoMaximo.getText();
                               
		                   
		            nuevoC.setNombre(N);
		   	    nuevoC.setUser(usuario);
                            nuevoC.setContraseña(contraseña);
                            nuevoC.setSaldoInicial(saldoinicial);
                            nuevoC.setMontoMaximo(montomaximo);
		   	     dispose();   
		                
	        if(text_field_Nombre.getText().equals("")){
	           JOptionPane.showMessageDialog(null,"Por favor Ingrese nombre");
	           return;
	           }              
	       if(text_field_Usuario.getText().equals("")){
	           JOptionPane.showMessageDialog(null,"Por favor Ingrese un usuario");
	           return;	       
	           }
                if(text_field_Contraseña.getText().equals("")){
	           JOptionPane.showMessageDialog(null,"Por favor Ingrese un usuario");
	           return;	       
	           }
                if(text_field_SaldoInicial.getText().equals("")){
	           JOptionPane.showMessageDialog(null,"Por favor Ingrese un usuario");
	           return;	       
	           }
                if(text_field_MontoMaximo.getText().equals("")){
	           JOptionPane.showMessageDialog(null,"Por favor Ingrese un usuario");
	           return;	       
	           }
	    	         
	        if(text_field_Nombre.getText().equals(N)
	                && text_field_Usuario.getText().equals(usuario)){
	           JOptionPane.showMessageDialog(null,"Se ha agregado correctamente");
	        
                
                text_field_Nombre.setText("");
                text_field_Usuario.setText("");
                text_field_Contraseña.setText("");
                text_field_SaldoInicial.setText("");
                text_field_MontoMaximo.setText("");   
                   return;
	           
	           } 
                
	             }
                
                
	         }
	    
	     
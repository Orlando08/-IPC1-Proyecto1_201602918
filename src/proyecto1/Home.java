/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author EMILY_COYOY
 */
public class Home extends JFrame{
    
    private JPanel contentPane;
    private JLabel usuarios;
    private JLabel contraseña;
    private JTextField usua;
    private JPasswordField contras;
    private JButton acceder;
    
    
    
    superus su = new superus();
    
    empresas emp = new empresas();
    
    public Home(){
        init_Component();
    }
    
    
    private void init_Component(){
        
        setSize(280,300);//1550,770
        setTitle("SIBE");
        
        this.getContentPane().setBackground(Color.GRAY);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        
        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        
        setLocationRelativeTo(null);
        
        usuarios = new JLabel("Usuario:",JLabel.CENTER);
        
        usuarios.setSize(100,30);
        usuarios.setLocation(05,35);
        
        contentPane.add(usuarios);
        
        usua = new JTextField();
        usua.setSize(120,25);
        usua.setLocation(110,35);
        
        contentPane.add(usua);
        
        contraseña = new JLabel("Contraseña:",JLabel.CENTER);
        
        contraseña.setSize(100,30);
        contraseña.setLocation(05,100);
        
        contentPane.add(contraseña);
        
        contras = new JPasswordField();
        contras.setSize(120,25);
        contras.setLocation(110,100);
        
        contentPane.add(contras);
        
        acceder = new JButton("Acceder");
        acceder.setSize(140,40);
        acceder.setLocation(70,180);
        acceder.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent evt) {
	            acceder(evt);
                    
                    
	        }
	    });
        contentPane.add(acceder);
        
        
        
        
    }
    
    public void acceder(ActionEvent evt){
        
        String saldous = null;
                
        if(usua.getText().equals("ipc1Admin")&&contras.getText().equals("aux1")){
            su.show();
        }
    for (int i=0; i<500;i++){
         
     try{       
    if( usua.getText().equals(su.cliente[i].user)&&contras.getText().equals(su.cliente[i].contraseña)){ 
       
        emp.show();
        
        saldous = su.cliente[i].SaldoInicial;
        
        
        //usua.setText("");
        //contras.setText("");
        }
     }
     catch(Exception e){
         System.out.print("");
        
     }
        //} 
    
        
    }
    usua.setText("");
    contras.setText("");
    String saldoini = saldous;
    System.out.println(saldoini);
    
    }
    
        
}


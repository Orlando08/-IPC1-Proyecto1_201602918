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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
/**
 *
 * @author EMILY_COYOY
 */
public class propisto extends JFrame {
    private JPanel contentPane;
    private JLabel prop;
    private JLabel titulo;
    private JButton saldo;
    private JButton transferencia;
    private JButton impresion;
    private JButton graficaba;
    private JButton graficapie;
    private JButton logout;
    private JLabel img;
    
    
    //saldocuenta sa = new saldocuenta();
     public propisto(){
        init_Component();
    }
    
    
    private void init_Component(){
        
        setSize(800,700);//1550,770
        setTitle("Pro-Pisto");
        
        this.getContentPane().setBackground(Color.GRAY);
        
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setResizable(false);
        
        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        
        setLocationRelativeTo(null);
        
        titulo = new JLabel("Pro-Pisto",JLabel.CENTER);
        titulo.setFont(new Font("Helvetica",Font.BOLD,100));
        titulo.setSize(500,140);
        titulo.setLocation(210,30);
        
        contentPane.add(titulo);
        
        prop = new JLabel();
        ImageIcon pr= new ImageIcon("propisto.jpg");
        prop.setIcon(pr);
        prop.setSize(200,150);
        prop.setLocation(05,05);
        
        contentPane.add(prop);
        
        img = new JLabel();
        ImageIcon i = new ImageIcon("img.png");
        img.setIcon(i);
        img.setSize(300,400);
        img.setLocation(10,200);
        
        contentPane.add(img);
        
        saldo = new JButton("Saldo");        
        saldo.setSize(150,100);
        saldo.setLocation(400,200);
        saldo.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent evt) {
	            saldo(evt);
	        }
	    });
        contentPane.add(saldo);
        
        transferencia = new JButton("Transferencia");        
        transferencia.setSize(150,100);
        transferencia.setLocation(600,200);
        
        contentPane.add(transferencia);
        
        impresion = new JButton("Impresion Voucher");        
        impresion.setSize(150,100);
        impresion.setLocation(400,350);
        
        contentPane.add(impresion);
        
        graficaba = new JButton("Grafica de Barras");        
        graficaba.setSize(150,100);
        graficaba.setLocation(600,350);
        
        contentPane.add(graficaba);
        
        graficapie = new JButton("Grafica de Pie");        
        graficapie.setSize(150,100);
        graficapie.setLocation(500,500);
        
        contentPane.add(graficapie);
        
        logout = new JButton("Logout");        
        logout.setSize(120,80);
        logout.setBackground(Color.ORANGE);
        logout.setLocation(90,550);
        logout.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent evt) {
	            logout(evt);
	        }
	    });
        contentPane.add(logout);
    }
    public void logout(ActionEvent evt){
        
        this.dispose();
        
        
    }
    public void saldo(ActionEvent evt){
       // sa.show();
    }

}

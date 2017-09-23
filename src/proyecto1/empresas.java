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

/**
 *
 * @author EMILY_COYOY
 */
public class empresas extends JFrame{
    private JPanel contentPane;
    private JButton propisto;
    private JLabel propis;
    private JLabel cashm;
    private JButton cashmoney;
    private JLabel elija;
    
    propisto pro = new propisto();
    
     public empresas(){
        init_Component();
    }
    
    
    private void init_Component(){
        
        setSize(390,375);//1550,770
        setTitle("SIBE");
        
        this.getContentPane().setBackground(Color.GRAY);
        
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setResizable(false);
        
        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        
        setLocationRelativeTo(null);
        
        elija = new JLabel("Elija un cajero",JLabel.CENTER);
        elija.setFont(new Font("Helvetica",Font.BOLD,40));
        elija.setSize(300,50);
        elija.setLocation(40,50);
        
        contentPane.add(elija);
        
        propis = new JLabel("Pro-Pisto",JLabel.CENTER);
        propis.setFont(new Font("Times Roman",Font.BOLD,15));
        propis.setSize(100,50);
        propis.setLocation(75,280);
        
        contentPane.add(propis);
        
        cashm = new JLabel("Cash-money",JLabel.CENTER);
        cashm.setFont(new Font("Times Roman",Font.BOLD,15));
        cashm.setSize(100,50);
        cashm.setLocation(220,280);
        
        contentPane.add(cashm);
        
        propisto = new JButton();
        ImageIcon pro = new ImageIcon("propisto.jpg");
        propisto.setIcon(pro);
        propisto.setSize(120,100);
        propisto.setLocation(60,180);
        propisto.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent evt) {
	            propisto(evt);
	        }
	    });
        contentPane.add(propisto);
        
        cashmoney = new JButton();
        ImageIcon cash = new ImageIcon("cashmoney.jpg");
        cashmoney.setIcon(cash);
        cashmoney.setSize(120,100);
        cashmoney.setLocation(210,180);
        
        contentPane.add(cashmoney);
        
        
    }
    public void propisto(ActionEvent evt){
        pro.show();
        this.dispose();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author EMILY_COYOY
 */
public class Cliente {
    
    public String nombre;
    public String contraseña;
    public String user;
    public String SaldoInicial;
    public String MontoMaximo; 
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
   public String getSaldoInicial(){
        return SaldoInicial;
    }
    public void setSaldoInicial(String SaldoInicial){
        this.SaldoInicial = SaldoInicial;
    }
    public String getMontoMaximo(){
        return MontoMaximo;
    }
    public void setMontoMaximo(String MontoMaximo){
        this.MontoMaximo = MontoMaximo;
    
    }
    
    
}

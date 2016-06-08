/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoHerenciaaa;
/**
 *
 * @author AZUCENA
 */
public class CuentaBancaria {
    private int numeroDeCuenta;
    private Cliente cliente;
    private double saldo;
    
    public CuentaBancaria (int numeroDeCuenta, Cliente cliente){
        
        this.cliente=new Cliente (cliente.getNombre(),cliente.getApellido());
        this.numeroDeCuenta=numeroDeCuenta;
        this.saldo =0.0;
    }
    
    public int getNumeroDeCuenta(){
     return numeroDeCuenta; 
     }
    
    public  void Depositar (double cantidad){
        
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo+cantidad;
        }
        else
        {
            System.out.print("EL DEPOSITO NO SE PUEDE REALIZA");
        }
    }
    
    public void Retirar (double cantidad){
        
        if (this.puedeRetirar(cantidad)){
            this.saldo = saldo-cantidad;
        }
        else
        {
            System.out.print("EL RETIRO NO SE PUEDE REALIZAR");
        }
    }
    
    public boolean puedeDepositar(double cantidad) {
        boolean siPuedeDepositar = false;
        
        if (cantidad > 0){
            siPuedeDepositar=true;
        }
        return siPuedeDepositar;
    }
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar=false;
        
        if (cantidad < this.saldo){
            siPuedeRetirar=true;
        }
            return siPuedeRetirar;
    }
    
    public double getSañdo(){
    return this.saldo;
    }
}


    
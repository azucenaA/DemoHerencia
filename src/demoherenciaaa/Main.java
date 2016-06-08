/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherenciaaa;
import java.util.Scanner;
/**
 *
 * @author AZUCENA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner entrada = new Scanner(System.in);
        
        System.out.println("CUENTA A LA QUE DESEA ACCEDER");
            System.out.println("1 = *CUENTA BANCARIA*");
            System.out.println("2 = *CUENTA DE AHORRO*");
            System.out.println("3 = *CUENTA DE CHEQUES*");
            int cuenta = entrada.nextInt();
        
        if (cuenta == 1){    
        System.out.println("*PROPORCIONE NUMERO DE CUENTA*.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("*PROPORCIONE NOMBRE DEL CLIENTE*.");
        String nombre = entrada.next();
        System.out.println("*PROPORCIONE APELLIDO DEL CLIENTE*.");
        String apellido = entrada.next();
        Cliente cliente = new Cliente(nombre, apellido);
        
        CuentaBancaria cuentaBancaria = 
                new CuentaBancaria(numeroDeCuenta, cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("*QUE ES LO QUE DESEA HACER:*");
            System.out.println("1 = *INTRODUCIR SUS DATOS PERSONALES*");
            System.out.println("2 = *PROPORCIONAR DATOS DEL CLIENTE*");
            System.out.println("3 = *DEPOSITAR*");
            System.out.println("4 = *RETIRAR*");
            System.out.println("5 = *FINALIZA*");
            int accion = entrada.nextInt();
            
            if (accion == 1){
                System.out.println("*PROPORCIONAR SU FECHA DE NACIMIENTO*.");
                String fechaDeNacimiento;
                fechaDeNacimiento = entrada.nextLine();
                fechaDeNacimiento = entrada.nextLine();
                
                System.out.println("*PROPOCIONAR SU DIRECCION*.");
                String direccion = entrada.nextLine();
               
                System.out.println("*PROPORCIONAR SU OCUPACION*.");
                String ocupacion= entrada.nextLine();
                
                System.out.println("*PROPORIONAR SU NUMERO DE TELEFONO*.");
                String numeroDetelefono= entrada.nextLine();
                
                System.out.println("*PROPORCIONAR SU CORREO ELECTRONICO*.");
                String correoElectronico= entrada.nextLine();
                
                
                cliente.setFechaDeNacimiento(fechaDeNacimiento);
                cliente.setDireccion(direccion);
                cliente.setOcupacion(ocupacion);
                cliente.setnumeroDetelefono(numeroDetelefono);
                cliente.setcorreoElectronico(correoElectronico);
            }
            
            if (accion == 2){
                System.out.println("*NUMERO DE CUENTA:*. " 
                        +cuentaBancaria.getNumeroDeCuenta());
                System.out.println("*NOMBRE DEL CLIENTE:*. " 
                        +cliente.getNombre());
                System.out.println("*APELLIDO DEL CLIENTE:*. " 
                        +cliente.getApellido());
                System.out.println("*FECHA DE NACIMIENTO DEL CLIENTE:*."
                        +cliente.getfechaDeNacimiento());
                System.out.println("*DIRECCION DEL CLIENTE:*. " 
                        +cliente.getDireccion());
                System.out.println("*LA OCUPACION DEL CLIENTE:*" 
                        +cliente.getOcupacion());
                System.out.println("*NUMERO DE TELEFONO DEL CLIENTE:*. "
                        +cliente.getnumeroDeTelefono());
                System.out.println("*CORREO ELECTRONICO:*. "
                        +cliente.getcorreoElectronico());
            }
            
            if (accion == 3){
                System.out.println("*CANTIDAD A DEPOSITAR:");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 4){
                System.out.println("*CANTIDAD A RETIRAR:");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 5){
                System.out.println("*FINALIZACION*!!!");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        else {
            System.out.println("*LO SENTIMOS, SU CUENTA NO ESTA DISPONIBLE*!.");
        }
    }
}

                
        
         
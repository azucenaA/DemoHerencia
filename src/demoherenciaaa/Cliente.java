/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherenciaaa;

/**
 *
 * @author AZUCENA
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String numeroDetelefono;
    private String correoElectronico;
    Cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = "xx*xx*xx";
        this.direccion = "x";
        this.ocupacion = "x";
        this.numeroDetelefono = "(xxx)xxx*xxxx";
        this.correoElectronico= "x";
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getOcupacion(){
        return ocupacion;
    }
    public String getnumeroDeTelefono(){
        return numeroDetelefono;
    }
    public String getcorreoElectronico(){
        return correoElectronico;
    }
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido){
        this.apellido =  apellido;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void setnumeroDetelefono(String numeroDetelefono){
        this.numeroDetelefono = numeroDetelefono;
    }
    public void setcorreoElectronico(String email){
        this.correoElectronico = correoElectronico;   
}
    }

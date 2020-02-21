/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author Rod
 */
public class Personal {
    private String nombre;
    private String apellido;
    private int anioIngreso;
    
    public Personal (){
        
    }
    
    public Personal (String nombre,String apellido,int anioIngreso){
        this.nombre=nombre;
        this.apellido=apellido;
        this.anioIngreso=anioIngreso;
    }
    
    @Override
    public String toString(){
       return "Nombre: "+this.nombre+" Apellido: "+this.apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    
}

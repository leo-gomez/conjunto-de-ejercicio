/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPNº6Ej3;

/**
 *
 * @author Rod
 */
public class Alumno {

    private String apellido;
    private String nombre;

    public Alumno() {

    }

    public Alumno(String a, String b) {
        this.nombre = a;
        this.apellido = b;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

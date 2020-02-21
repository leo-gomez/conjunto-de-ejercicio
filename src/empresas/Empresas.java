/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

import java.util.ArrayList;
import transportesPersonas.Vehiculo;

/**
 *
 * @author Rod
 */
public class Empresas {

    private String nombreComercial;
    private String direccion;
    private String telefono;
    private int anioInicioActividades;
    private int cantidadPasajesEmitidos;
    private ArrayList<Vehiculo> vehiculos;

    public Empresas() {

    }

    public Empresas(String nombreComercial, String direccion, String telefono, int anioInicioActividades, int cantidadPasajesEmitidos, ArrayList<Vehiculo> vehiculos) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.anioInicioActividades = anioInicioActividades;
        this.cantidadPasajesEmitidos = cantidadPasajesEmitidos;
        this.vehiculos = vehiculos;
    }

    public void emitirPasaje(int cantPasajes) {
        int index = buscarVehiculoDisponible(cantPasajes);
        vehiculos.get(index).ocuparAsientos(cantPasajes);
        this.cantidadPasajesEmitidos+=cantPasajes;
    }

    public void darBajaPasaje(int cantPasajes) {
        int index = -1;
        for (int i=0;i<vehiculos.size() && index == -1; i++){
            if (vehiculos.get(i).getAsientosOcupados()>=cantPasajes) {
                vehiculos.get(i).liberarAsientos(cantPasajes);
                index = i;
            }
        }
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void darBajaVehiculo(Vehiculo v) {
        vehiculos.remove(v);  
    }

    public int buscarVehiculoDisponible(int cantPasajes) {
        //agregar pasajes libres
        int index = -1;
        for (int i = 0; i < vehiculos.size() && index == -1; i++) {
            int asientosLibres = vehiculos.get(i).getCantidadAsientos() - vehiculos.get(i).getAsientosOcupados();
            if ((!vehiculos.get(i).estaCompleto()) && cantPasajes <= asientosLibres) {
                index = i;
            }
        }
        return index;
    }
    
    @Override
    public String toString(){
        return "\nEmpresa "+getNombreComercial()+"\nCantidad Pasajes Emitidos "+getCantidadPasajesEmitidos()
                +"\nVehiculos: "+getVehiculos();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAnioInicioActividades() {
        return anioInicioActividades;
    }

    public void setAnioInicioActividades(int anioInicioActividades) {
        this.anioInicioActividades = anioInicioActividades;
    }

    public int getCantidadPasajesEmitidos() {
        return cantidadPasajesEmitidos;
    }

    public void setCantidadPasajesEmitidos(int cantidadPasajesEmitidos) {
        this.cantidadPasajesEmitidos = cantidadPasajesEmitidos;
    }

}

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
public class Aerea extends Empresas {
    
    public Aerea (){
    }

    public Aerea(String nombreComercial, String direccion, String telefono, int anioInicioActividades, int cantidadPasajesEmitidos, ArrayList<Vehiculo> vehiculos) {
        super(nombreComercial, direccion, telefono, anioInicioActividades, cantidadPasajesEmitidos, vehiculos);
    }
    
    @Override
    public void emitirPasaje(int cantPasajes) {
        super.emitirPasaje(cantPasajes);
        System.out.println("\nPasaje/s aereo/s Emitido/s, cantidad: "+cantPasajes);
    }
    
    @Override
    public void darBajaPasaje(int cantPasajes) {
        super.darBajaPasaje(cantPasajes);
        System.out.println("\nPasaje/s aereo/s dado de baja");
    }

    @Override
    public void agregarVehiculo(Vehiculo v) {
        super.agregarVehiculo(v);
        System.out.println("Avion Agregado: "+v);
    }

    @Override
    public void darBajaVehiculo(Vehiculo v) {
        super.darBajaVehiculo(v);
        System.out.println("Avion dado de baja: "+v);
    }
}

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
public class Terrestre extends Empresas {

    public Terrestre(String nombreComercial, String direccion, String telefono, int anioInicioActividades, int cantidadPasajesEmitidos, ArrayList<Vehiculo> vehiculos) {
        super(nombreComercial, direccion, telefono, anioInicioActividades, cantidadPasajesEmitidos, vehiculos);
    }
    
}

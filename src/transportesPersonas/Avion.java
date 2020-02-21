/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportesPersonas;

import java.util.ArrayList;
import personal.Personal;
import personal.Tripulante;

/**
 *
 * @author Rod
 */
public class Avion extends Vehiculo {

    private String modelo;
    private int anioFabricacion;
    private int tipo; //1-cabotaje 2-internacional
    private int alturaMaxima; //altura a la que vuela
    
    public Avion (){
    }

    public Avion(String modelo, int anioFabricacion, int tipo, int alturaMaxima, int cantidadAsientos, int asientosOcupados, Personal persona, ArrayList<Tripulante> tripulantes) {
        super(cantidadAsientos, asientosOcupados, persona, tripulantes);
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
        this.alturaMaxima = alturaMaxima;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
}

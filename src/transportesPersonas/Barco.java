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
public class Barco extends Vehiculo {

    private String modelo;
    private int anioFabricacion;
    private float eslora;
    private int velocidadNudos;

    public Barco() {
    }

    public Barco(String modelo, int anioFabricacion, float eslora, int velocidadNudos, int cantidadAsientos, int asientosOcupados, Personal persona, ArrayList<Tripulante> tripulantes) {
        super(cantidadAsientos, asientosOcupados, persona, tripulantes);
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.velocidadNudos = velocidadNudos;
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

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public int getVelocidadNudos() {
        return velocidadNudos;
    }

    public void setVelocidadNudos(int velocidadNudos) {
        this.velocidadNudos = velocidadNudos;
    }
}

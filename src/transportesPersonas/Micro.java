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
public class Micro extends Vehiculo {

    private String marca;
    private String modelo;
    private String patente;
    private int cantPisos; //1o2
    private int velocidadMaxima;

    public Micro() {
    }

    public Micro(String marca, String modelo, String patente, int cantPisos, int velocidadMaxima, int cantidadAsientos, int asientosOcupados, Personal persona, ArrayList<Tripulante> tripulantes) {
        super(cantidadAsientos, asientosOcupados, persona, tripulantes);
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantPisos = cantPisos;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}

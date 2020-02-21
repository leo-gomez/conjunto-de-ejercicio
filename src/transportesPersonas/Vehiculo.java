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
public class Vehiculo {

    private int cantidadAsientos;
    private int asientosOcupados;
    private Personal persona;
    private ArrayList<Tripulante> tripulantes;

    Vehiculo() {
    }

    public Vehiculo(int cantidadAsientos, int asientosOcupados, Personal persona, ArrayList<Tripulante> tripulantes) {
        this.cantidadAsientos = cantidadAsientos;
        this.asientosOcupados = asientosOcupados;
        this.persona = persona;
        this.tripulantes = tripulantes;
    }

    @Override
    public String toString(){
        return "Cantidad de asientos: "+this.cantidadAsientos+", Asientos Ocupados: "+this.asientosOcupados+
                ", Personal "+this.persona+", Tripulantes "+this.tripulantes;
    }
    
    public void ocuparAsientos(int cantasientos) {
        if (!estaCompleto()) {
            if (this.cantidadAsientos >= (this.asientosOcupados + cantasientos)) {
                this.asientosOcupados = getAsientosOcupados()+cantasientos;
            } else {
                System.out.println("Cantidad asientos sobrepasa la ocupacion");
            }
        } else {
            System.out.println("Completo");
        }
    }

    public boolean estaCompleto() {
        return (this.cantidadAsientos == this.asientosOcupados);
    }

    public void liberarAsientos(int asientosALiberar) {
        if ((getAsientosOcupados() - asientosALiberar) < 0) {
            System.out.println("Los asientos ocupados no pueden ser negativos");
        } else {
            this.asientosOcupados = getAsientosOcupados() - asientosALiberar;
        }
    }

    public void agregarTripulante(Tripulante t) {
        tripulantes.add(t);
    }

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    public Personal getPersona() {
        return persona;
    }

    public void setPersona(Personal persona) {
        this.persona = persona;
    }
}

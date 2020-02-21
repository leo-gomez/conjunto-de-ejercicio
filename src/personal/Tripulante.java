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
public class Tripulante extends Personal {
    private int tipoTripulante; //int 1-aereo 2-terrestre 3-fluvial
    private int nroTripulante;
    
    public Tripulante (){
        
    }
    
    public Tripulante (String nombre,String apellido,int anioIngreso,int tipoTripulante,int nroTripulante){
        super(nombre,apellido,anioIngreso);
        this.tipoTripulante=tipoTripulante;
        this.nroTripulante=nroTripulante;
}
    
    public int getTipoTripulante() {
        return tipoTripulante;
    }

    public void setTipoTripulante(int tipoTripulante) {
        this.tipoTripulante = tipoTripulante;
    }

    public int getNroTripulante() {
        return nroTripulante;
    }

    public void setNroTripulante(int nroTripulante) {
        this.nroTripulante = nroTripulante;
    }
}

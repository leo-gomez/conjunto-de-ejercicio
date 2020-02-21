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
public class Piloto extends Personal {

    private int nroPiloto;
    private int tipoPiloto;//1-Cabotaje 2-Internacional 3-Ambos

    public Piloto() {

    }

    public Piloto(String nombre, String apellido, int anioIngreso, int nroPiloto, int tipoPiloto) {
        super(nombre, apellido, anioIngreso);
        this.nroPiloto = nroPiloto;
        this.tipoPiloto = tipoPiloto;
    }

    public int getNroPiloto() {
        return nroPiloto;
    }

    public void setNroPiloto(int nroPiloto) {
        this.nroPiloto = nroPiloto;
    }

    public int getTipoPiloto() {
        return tipoPiloto;
    }

    public void setTipoPiloto(int tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }

}

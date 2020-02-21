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
public class Chofer extends Personal {
    private int nroRegistro;
    private int vencimientoRegistro;
    
   public Chofer(){
       
   }
    
   public Chofer (String nombre,String apellido,int anioIngreso,int nroRegistro,int vencimientoRegistro){
       super(nombre,apellido,anioIngreso);
       this.nroRegistro=nroRegistro;
       this.vencimientoRegistro=vencimientoRegistro;
   }

    public int getNroRegistro() {
        return nroRegistro;
    }

    public void setNroRegistro(int nroRegistro) {
        this.nroRegistro = nroRegistro;
    }

    public int getVencimientoRegistro() {
        return vencimientoRegistro;
    }

    public void setVencimientoRegistro(int vencimientoRegistro) {
        this.vencimientoRegistro = vencimientoRegistro;
    }
}

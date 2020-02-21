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
public class Capitan extends Personal {
    private int nroCapitan;
    
    public Capitan (){
        
    }

    public Capitan (String nombre,String apellido, int anioIngreso,int nroCapitan){
        super(nombre,apellido,anioIngreso);
        this.nroCapitan=nroCapitan;
    }
    
    public int getNroCapitan() {
        return nroCapitan;
    }

    public void setNroCapitan(int nroCapitan) {
        this.nroCapitan = nroCapitan;
    }
    
}

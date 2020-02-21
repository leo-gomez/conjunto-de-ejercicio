/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPNº8Ej4;

import empresas.Aerea;
import empresas.Empresas;
import empresas.Fluvial;
import empresas.Terrestre;
import java.util.ArrayList;
import personal.Capitan;
import personal.Chofer;
import personal.Personal;
import personal.Piloto;
import personal.Tripulante;
import transportesPersonas.Avion;
import transportesPersonas.Barco;
import transportesPersonas.Micro;
import transportesPersonas.Vehiculo;


public class TPNº8Ej4Main {
    public static void main (String [] args){
        
        Personal p1 = new Piloto();
        Personal p2 = new Piloto("Pascual", "Ang",2007, 55, 2);
        Personal ch1 = new Chofer("Sebi","Rod",1999,2322,2032);
        Personal t1 = new Tripulante("Coco","Gonza",1960,1,25);
        Personal t2 = new Tripulante ("Rod","Gonza",1995,2,200);
        Personal cap1 = new Capitan ("Cozme","Ful",2005,12);
        
        Vehiculo a1 = new Avion("Boeing 686",2019,1,20000,50,0,p1,new ArrayList<>());
        Vehiculo a2 = new Avion("Boeing 676",2018,2,25000,60,0,p2,new ArrayList<>());
        Vehiculo b1 = new Barco ("Flotante", 2018,50.5f,200,40,0,cap1,new ArrayList<>());
        Vehiculo m1 = new Micro ("El Detalle", "WIFI", "ABX 150", 2, 90, 30, 0, ch1, new ArrayList<>());
        
        Empresas AA = new Aerea("Aerolineas Argentinas","Punta medano 888","222-2222",1985,0,new ArrayList<>());
        Empresas TT = new Terrestre("Tony Tur","Aca a la Vuelta 208","333-3333",2006,0,new ArrayList<>());
        Empresas BQ = new Fluvial ("Buquebus","Lomas del Totó 77","77-7777 int 7",1977,0,new ArrayList<>());
        
        AA.agregarVehiculo(a1);
        AA.agregarVehiculo(a2);
        TT.agregarVehiculo(m1);
        BQ.agregarVehiculo(b1);
        
        p1.setNombre("Gustavo");
        p1.setApellido("Sonvico");
        
        
        a1.agregarTripulante((Tripulante) t1);
        a1.agregarTripulante((Tripulante) t2);
        a2.agregarTripulante((Tripulante) t1);
        
        m1.agregarTripulante((Tripulante) t1);
        
        b1.agregarTripulante((Tripulante) t2);
       
        System.out.println(AA);
        
        System.out.println(TT);
        System.out.println(BQ);
        
        //Emitir pasaje
        AA.emitirPasaje(2);
        System.out.println(AA);
        
        //Ahora emito mas pasajes para ocupar el siguiente avion.
        AA.emitirPasaje(49);
        System.out.println(AA);
        
        //Ahora emito mas pasajes para ocupar el primer avion.
        AA.emitirPasaje(48);
        System.out.println(AA);
        
    }
}

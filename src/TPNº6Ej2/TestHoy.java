/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPNº6Ej2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rod
 */
public class TestHoy {

    public static void main(String[] args) {
        Hoy fecha1 = new Hoy(10, 3, 2009);
        Hoy fecha2 = new Hoy();

        fecha2.setDia(11);
        fecha2.setMes(7);
        fecha2.setAño(2008);

        System.out.println("Fecha1: " + fecha1.getDia() + "/" + fecha1.nombreDeMes(fecha1.getMes()) + "/" + fecha1.getAño());
        System.out.println("\nFecha2: " + fecha2.getDia() + "/" + fecha2.nombreDeMes(fecha2.getMes()) + "/" + fecha2.getAño());

        fecha2.setDia(10);

        if (fecha1.equals(fecha2)) {
            System.out.println("\nLas fechas son iguales");
        } else {
            System.out.println("\nLas fechas son distintas");
        }
        System.out.println("Fecha1: " + fecha1.getDia() + "/" + fecha1.nombreDeMes(fecha1.getMes()) + "/" + fecha1.getAño());
        System.out.println("\nFecha2: " + fecha2.getDia() + "/" + fecha2.nombreDeMes(fecha2.getMes()) + "/" + fecha2.getAño());
    }
}

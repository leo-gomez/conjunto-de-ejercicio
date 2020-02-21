/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPNº6Ej2;

/**
 *
 * @author Rod
 */
public class Hoy {

    private int dia;
    private int mes;
    private int año;

    public Hoy() {
    }

    public Hoy(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.año = a;
    }

    public String nombreDiaDeSemana(int numeroDia) {
        String nombreDia[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String diax;
        diax = nombreDia[numeroDia - 1];
        return diax;
    }

    public String nombreDeMes(int numeroMes) {
        String nombreMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String mesx = nombreMes[numeroMes - 1];
        return mesx;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

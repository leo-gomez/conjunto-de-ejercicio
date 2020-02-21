/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPNº6Ej3;

/**
 *
 * @author Rod
 */
public class Boletin {

    private static int[][] notas;
    private Alumno alumno;
    private String[] materias;

    public Boletin() {
    }

    public Boletin(String[] materias, Alumno alumno) {
        this.notas = new int[3][materias.length];
        this.alumno = alumno;
        this.materias = materias;
    }

    public void agregarNota(String materia, int nota, int trimestre) {
        int i = 0;
        boolean flag = false;
        while ((i < notas.length) && (!flag)) {
            if (materias[i].equals(materia)) {
                flag = true;
                notas[i][trimestre - 1] = nota;
            } else {
                i++;
            }
        }
    }

    public int obtenerNota(String materia, int trimestre) {
        boolean flag = false;
        int i = 0, nota = 0;
        while ((i < notas.length) && (!flag)) {
            if (materias[i].equals(materia)) {
                flag = true;
                nota = notas[trimestre - 1][i];
            } else {
                i++;
            }
        }
        return nota;
    }

    public int[][] getNotas() {
        return notas;
    }

    public void setNotas(int[][] notas) {
        this.notas = notas;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

}

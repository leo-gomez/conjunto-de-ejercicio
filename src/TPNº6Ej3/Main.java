
package TPNº6Ej3;

import java.util.Scanner;

/**
 *
 * @author Rod
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] trimestres = {"1º Trimestre", "2º Trimestre", "3º Trimestre"};
        String materias[] = {"Matemática ", "   Física   ", "    Lengua   ", "    Música  ", "    Ed. Física"};

        Alumno a1 = new Alumno("María", "Fernandez");
        Boletin b1 = new Boletin(materias, a1);

        for (short i = 0; i < trimestres.length; i++) { //agrego notas al boletin
            for (short j = 0; j < materias.length; j++) {
                b1.agregarNota(materias[i], ((int) (Math.random() * 10) + 1), j + 1);
            }
        }

        System.out.print(a1.getNombre());
        System.out.println(" " + a1.getApellido());
        System.out.print("\t\t");

        for (String aux : materias) {//imprimo string materias
            System.out.print(aux);
        }

        for (short s = 0; s < 3; s++) {//imprimo trimestres y notas

            System.out.print("\n" + trimestres[s] + "   ");
            for (short k = 0; k < materias.length; k++) {
                if (b1.getNotas()[s][k] == 10) {
                    System.out.print("     " + b1.getNotas()[s][k] + "      ");
                } else {
                    System.out.print("     " + b1.getNotas()[s][k] + "       ");
                }
            }

        }
        System.out.println("");
        System.out.println("\n\nAverigue nota de Matemática");
        System.out.println("Ingrese el trimestre");
        int trim = scan.nextInt();
        int out = b1.obtenerNota(materias[0], trim);
        System.out.println("\nLa nota es: " + out);
    }
}

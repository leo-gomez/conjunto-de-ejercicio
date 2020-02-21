/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnº6;

import java.util.Scanner;

/**
 *
 * @author Rod
 */
public class TPNº6Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Funciones f = new Funciones();//Crea objetos
        int a, b;
        boolean flag = true;
        while (flag) {
            menu();
            int op = scan.nextInt();
            while (op < 0 || op > 4) {
                System.out.println("Opcion Incorrecta. Ingrese la opción deseada:");
                op = scan.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("\nIntroduzca el primer numero");
                    a = scan.nextInt();
                    while (a == 0) {
                        System.out.println("\nEl numero no puede ser cero. Introduzca el primer numero");
                        a = scan.nextInt();
                    }
                    System.out.println("\nIntroduzca el segundo numero que debe ser mayor al primero");
                    b = scan.nextInt();
                    while ((b < a) || (b == 0)) {
                        System.out.println("\nEl segundo numero debe ser mayor al primero y distinto de cero");
                        b = scan.nextInt();
                    }
                    System.out.println("\nIntroduzca el numero multiplo");
                    int x = scan.nextInt();
                    while (x <= 0) {
                        System.out.println("\nEl multiplo debe ser mayor a cero");
                        x = scan.nextInt();
                    }
                    f.multiplos(a, b, x);
                    break;
                case 2:
                    System.out.println("\nIntroduzca el primer numero");
                    a = scan.nextInt();
                    while (a == 0) {
                        System.out.println("\nEl numero no puede ser cero. Introduzca el primer numero");
                        a = scan.nextInt();
                    }
                    System.out.println("\nIntroduzca el segundo numero que debe ser mayor al primero");
                    b = scan.nextInt();
                    while ((b < a) || (b == 0)) {
                        System.out.println("\nEl segundo numero debe ser mayor al primero y distinto de cero");
                        b = scan.nextInt();
                    }
                    f.pares(a, b);
                    break;
                case 3:
                    System.out.println("\nIntroduzca el primer numero");
                    a = scan.nextInt();
                    while (a == 0) {
                        System.out.println("\nEl numero no puede ser cero. Introduzca el primer numero");
                        a = scan.nextInt();
                    }
                    System.out.println("\nIntroduzca el segundo numero que debe ser mayor al primero");
                    b = scan.nextInt();
                    while ((b < a) || (b == 0)) {
                        System.out.println("\nEl segundo numero debe ser mayor al primero y distinto de cero");
                        b = scan.nextInt();
                    }
                    f.impares(a, b);
                    break;
                case 4:
                    System.out.println("\nIntroduzca el termino hasta donde desea ver la serie");
                    int fn,
                     n = scan.nextInt();
                    while (n < 0) {
                        System.out.println("El termino no puede ser menor a cero");
                        n = scan.nextInt();
                    }
                    for (int i = 0; i <= n; i++) {
                        int fib = f.fibonacci(i);
                        System.out.print(fib + ",");
                    }
                    break;
                default:
                    flag = false;
            }
        }
    }

    public static void menu() {
        System.out.println("\nIngrese:\n");
        System.out.println("1. Multiplos");
        System.out.println("2. Pares");
        System.out.println("3. Impares");
        System.out.println("4. Fibonacci");
        System.out.println("0. Para salir\n");
    }

}

package tpnº6;

public class Funciones {

    public void multiplos(int a, int b, int x) {
        int cont = 0;
        System.out.println("Los multiplos de " + x + " desde " + a + " hasta " + b + " son: ");
        for (int i = a; i <= b; i++) {
            int resto;
            try {
                if (i < 0) {
                    int va = Math.abs(i);
                    if (va >= x) {
                        resto = i % x;
                        if (resto == 0) {
                            System.out.println(i + ",");
                            cont++;
                        }
                    } else {
                        resto = x % i;
                        if (resto == 0) {
                            System.out.println(i + ",");
                            cont++;
                        }
                    }
                } else {
                    if (i <= x) {
                        resto = x % i;
                        if (resto == 0) {
                            System.out.println(i + ",");
                            cont++;
                        }
                    } else {
                        resto = i % x;
                        if (resto == 0) {
                            System.out.println(i + ",");
                            cont++;
                        }
                    }
                }
            } catch (ArithmeticException ex) {
            }
        }
        if (cont == 0) {
            System.out.println("\nNo existen múltiplos");
        }

    }

    public void pares(int a, int b) {
        int i = a;
        do {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        } while (i <= b);

    }

    public void impares(int a, int b) {
        int i = a;
        do {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
            i++;
        } while (i <= b);
    }

    public int fibonacci(int n) {
        int fib;
        if (n > 1) {
            fib = fibonacci(n - 1) + fibonacci(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base 1
            fib = 1;
        } else {  // caso base 2
            fib = 0;
        }
        return fib;
    }
}

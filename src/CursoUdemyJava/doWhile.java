package CursoUdemyJava;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // execute isso quanto for true.
        // doWhile é perfeito para menus em geral.
        int numero;

        do {
            System.out.println("digite um numero de 0 a 100: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 100);

        System.out.println("o numero valido é: " + numero);

        scanner.close();
    }
}

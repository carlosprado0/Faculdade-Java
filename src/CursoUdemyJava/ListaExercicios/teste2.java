package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;

        System.out.println("Seu numero ao quadrado é: " + quadrado);
        scanner.close();
    }
}

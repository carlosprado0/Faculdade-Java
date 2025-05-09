package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digete a nota da teste: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digete a nota da prova: ");
        int valor2 = scanner.nextInt();

        System.out.println("Digete a nota da simulado: ");
        int valor3 = scanner.nextInt();

        double media = (valor1 + valor2 + valor3) / 3;
        System.out.println("Sua média é: " + media);

        scanner.close();
    }
}

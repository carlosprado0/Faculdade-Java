package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos numeros é: " + soma);
        scanner.close();
    }
}

package CursoUdemyJava.ListaExerciciosTres;

import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero?: ");
        int numero = scanner.nextInt();

        String parOuImpar = (numero % 2 == 0) ? "é par" : "não par";

        System.out.println("O numero " + parOuImpar);
    }
}

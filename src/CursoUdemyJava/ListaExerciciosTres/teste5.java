package CursoUdemyJava.ListaExerciciosTres;

import java.util.Scanner;

public class teste5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?: ");
        int years = scanner.nextInt();
        String ehDeMaior = (years > 18) ? "Sim é maior" : "Vai ter que esperar fazer 18 rapazKK";
        System.out.println(ehDeMaior);
    }
}

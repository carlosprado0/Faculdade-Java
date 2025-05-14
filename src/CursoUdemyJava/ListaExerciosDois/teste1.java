package CursoUdemyJava.ListaExerciosDois;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite 10: ");
        int contador = scanner.nextInt();

        while( contador >= 1){
            System.out.println(contador);
            contador = contador - 1;
        }
    }
}

package CursoUdemyJava.ListaExerciosDois;

import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        while (numero <= 10) {
            soma = soma + numero;
            numero++;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}

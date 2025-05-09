package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual = 2025;

        System.out.println("Insera seu ano de Nascimento: ");
        int anoNascimento = scanner.nextInt();

        double idade = anoAtual - anoNascimento;

        if (idade >= 18){
            System.out.println("Parabens sua idade é "+ idade +", ja pode ser preso hahaha, brinks, pode votar no L");
        } else{
        System.out.println("Parabens você não vota, não esta perdendo nada tbm, o BR é um CIRCO");
        }
        scanner.close();
    }
}

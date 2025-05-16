package CursoUdemyJava.ListaExerciciosTres;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Domingo");
            System.out.println("2 - Segunda");
            System.out.println("3 - Terça");
            System.out.println("4 - Quarta");
            System.out.println("5 - Quinta");
            System.out.println("6 - Sexta");
            System.out.println("7 - Sábado");
            System.out.println("0 - Saindo...");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Dia selecionado foi: Domingo");
                    break;
                case 2:
                    System.out.println("Dia selecionado foi: Segunda");
                    break;
                case 3:
                    System.out.println("Dia selecionado foi: Terça");
                    break;
                case 4:
                    System.out.println("Dia selecionado foi: Quarta");
                    break;
                case 5:
                    System.out.println("Dia selecionado foi: Quinta");
                    break;
                case 6:
                    System.out.println("Dia selecionado foi: Sexta");
                    break;
                case 7:
                    System.out.println("Dia selecionado foi: Sábado");
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Escolha um número valido!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

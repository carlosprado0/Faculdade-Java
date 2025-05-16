package CursoUdemyJava;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Pizza");
            System.out.println("2 - Pastel");
            System.out.println("3 - Bolo");
            System.out.println("0 - Saindo...");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Pizza");
                    break;
                case 2:
                    System.out.println("Pastel");
                    break;
                case 3:
                    System.out.println("Bolo");
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("escolha um numero valido");
            }
        } while (opcao != 0);
    }
}

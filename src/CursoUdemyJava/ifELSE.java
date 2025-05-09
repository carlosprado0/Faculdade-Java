package CursoUdemyJava;

import java.util.Scanner;

public class ifELSE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digete a nota da teste: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digete a nota da prova: ");
        int valor2 = scanner.nextInt();

        System.out.println("Digete a nota da simulado: ");
        int valor3 = scanner.nextInt();

        double media = (valor1 + valor2 + valor3) / 3;

        if (media >= 6){
            System.out.println("Sua media é " + media + ", você Passou!!");
        } else {
            System.out.println("Sua media é " + media + ", você Reprovou!");
        }
        scanner.close();
    }
}

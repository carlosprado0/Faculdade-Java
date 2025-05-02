package CursoUdemyJava;

import java.util.Scanner;

public class treinandoTiposPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite o ano em que nasceu: ");
//        int anoNascimento = scanner.nextInt();
//
//        System.out.println("Digite o ano atual: ");
//        int anoAtual = scanner.nextInt();
//
//        int resultado = anoAtual - anoNascimento ;
//
//        System.out.println("Sua idade é: " + resultado + " anos.");

        System.out.println("Seu peso: ");
        float peso = scanner.nextFloat();

        System.out.println("Sua altura: ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu MC é: " + imc);
        scanner.close();
    }
}

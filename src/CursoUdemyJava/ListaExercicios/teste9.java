package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os lados do triangulo: ");
        System.out.println("lado 1: ");
        double lado1 = scanner.nextInt();
        System.out.println("lado 2: ");
        double lado2 = scanner.nextInt();
        System.out.println("lado 3: ");
        double lado3 = scanner.nextInt();

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("É um triangulo equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("É um triangulo Isósceles");
        }else {
            System.out.println("É um triangulo Escaleno");
        }


        scanner.close();
    }
}

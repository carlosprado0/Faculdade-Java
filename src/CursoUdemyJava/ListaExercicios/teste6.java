package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do retangulo: ");
        double altura = scanner.nextInt();
        System.out.println("Digite a base do retangulo: ");
        double base = scanner.nextInt();

        double perimetro = 2 * (base * altura);
        double area = base * altura;

        System.out.println("O perimetro é: " + perimetro + " e a area é: " + area);

        scanner.close();
    }
}

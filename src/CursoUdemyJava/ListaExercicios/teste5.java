package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temp. em Fahrenheit é:" + fahrenheit);

        scanner.close();
    }
}

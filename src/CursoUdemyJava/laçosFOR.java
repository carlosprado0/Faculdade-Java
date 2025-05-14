package CursoUdemyJava;

import java.util.Scanner;

public class laçosFOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero no qual o contador deva chegar: ");
        int valor = scanner.nextInt();

        for( int contador = 1 ;contador <= valor; contador++){
            System.out.println(contador);
        }


        scanner.close();
    }
}

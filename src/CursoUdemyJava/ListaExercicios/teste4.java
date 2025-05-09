package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero: ");
        int num = scanner.nextInt();
        if(num == 0){
            System.out.println("Numero é nulo");
        } else if (num > 0) {
            System.out.println("Numero é positivo");
        } else {
            System.out.println("Numero é negativo");
        }
        scanner.close();
    }
}

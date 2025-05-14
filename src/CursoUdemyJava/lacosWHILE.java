package CursoUdemyJava;

import java.util.Scanner;

public class lacosWHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero no qual o contador deva chegar: ");
        int contador = scanner.nextInt();
        int valorInicial = 2;

        //while significa enquanto

        while(valorInicial <= contador){
            System.out.println(valorInicial);
            valorInicial = valorInicial + 2; //Para incrementar +1, e nao ficar no laço infinito de 1,1,1,1...
        }

        scanner.close();
    }
}

package CursoUdemyJava;

import java.util.Scanner;

public class exemploFOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String lerLetras = scanner.nextLine();

        int quantidadeLetras = 0;

        for (int indice = 0; indice < lerLetras.length(); indice++ ){
            char letra = lerLetras.charAt(indice);
            boolean ehLetra = Character.isLetter(letra);

            if (ehLetra) {
                quantidadeLetras++;
            }
        }
        System.out.println("a quantidade é: " + quantidadeLetras);

        scanner.close();
    }
}

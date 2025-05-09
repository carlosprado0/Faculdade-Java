package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque a quantidade de maçãs compradas:");
        int quantidade = scanner.nextInt();

        double precoUnitario; //Pois o preço vai variar
        if (quantidade <= 12) {
            precoUnitario = 0.30;
        } else{
            precoUnitario = 0.25;
        }

        double valorTotal = quantidade * precoUnitario;

        System.out.println("O valor da compra é: " + valorTotal);
        scanner.close();
    }
}

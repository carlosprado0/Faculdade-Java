package Desafio1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja ser invertido: ");
        int numero = scanner.nextInt();

        int unidade = numero % 10;
        int dezena = (numero/ 10) % 10;
        int centena = numero / 100;

        int numeroInvertido= unidade * 100 + dezena * 10 + centena;
        System.out.println("O numero invertido é," + numero + ", para," + numeroInvertido);
    }
}
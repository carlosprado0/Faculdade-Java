package CursoUdemyJava.ListaExercicios;

import java.util.Scanner;

public class teste10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe o sexo da seguinte maneira(digite 1 :feminino e digite 2:masculino): ");
        double sexo = scanner.nextDouble();

        double pesoIdeal;

        if (sexo == 1){
            pesoIdeal = ( 72.7 * altura ) - 58;
        }else if (sexo == 2) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo invalido");
            return;
        }

        System.out.println("O peso ideal é: " + pesoIdeal + "kg");
        scanner.close();
    }
}

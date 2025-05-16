package CursoUdemyJava.ListaExerciciosTres;

import java.util.Scanner;

public class teste4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe salario Bruto: ");

        double salarioBruto = scanner.nextDouble();

        if (salarioBruto > 2000){
            double roubo = (salarioBruto - 2000.00) * 0.15;
            System.out.println("Imposto a ser pago é: " + roubo);
        }else{
            System.out.println("Você é isento");
        }
    }
}

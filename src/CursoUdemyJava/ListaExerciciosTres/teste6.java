package CursoUdemyJava.ListaExerciciosTres;

import java.util.Scanner;

public class teste6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do mes que deseja: ");
        int opcaoMes = scanner.nextInt();
        int dias;

            switch (opcaoMes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;
                case 2:
                    dias = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    dias = 30;
                    break;
                default:
                    dias = -1;
                    break;
        }
        if (dias != -1){
            System.out.println("O mês " + opcaoMes + " tem " + dias + " dias");
        } else {
            System.out.println("Mês invalido");
        }

        scanner.close();
    }
}

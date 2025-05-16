package CursoUdemyJava.ListaExerciciosTres;

import java.util.Scanner;

public class teste7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um nome: ");
        String usuario = scanner.nextLine();
        System.out.println("Informe uma senha: ");
        String senha = scanner.nextLine();

       if (usuario.equals("admin") && senha.equals("1234")) {
           System.out.println("Autenticação bem-sucedida");
       }else {
           System.out.println("Deu merda ");
       }
        scanner.close();
    }
}

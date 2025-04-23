package AlunoDesafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando a classe Aluno
        Aluno aluno = new Aluno();

        // Coletando dados do aluno
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite o endereço residencial: ");
        aluno.endereco = scanner.nextLine();

        System.out.print("Digite o telefone de contato: ");
        aluno.telefone = scanner.nextLine();

        System.out.print("Digite o endereço de e-mail: ");
        aluno.email = scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        aluno.matricula = scanner.nextLine();

        // Exibindo os dados cadastrados
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Endereço: " + aluno.endereco);
        System.out.println("Telefone: " + aluno.telefone);
        System.out.println("E-mail: " + aluno.email);
        System.out.println("Matrícula: " + aluno.matricula);

        scanner.close();
    }
}

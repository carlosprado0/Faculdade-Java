package Desafio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro
        Controle cliente = new Controle();
        System.out.print("Digite o nome do cliente: ");
        cliente.nomeCliente = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        cliente.cpf = scanner.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        cliente.enderecoCliente = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        cliente.telefone = scanner.nextLine();

        System.out.print("Digite o e-mail do cliente: ");
        cliente.email = scanner.nextLine();

        // Cadastro do veículo
        Modelo veiculo = new Modelo();
        System.out.print("Digite a placa do veículo: ");
        veiculo.placaVeiculo = scanner.nextLine();

        System.out.print("Digite o modelo do veículo: ");
        veiculo.modelo = scanner.nextLine();

        System.out.print("Digite o ano do veículo: ");
        veiculo.ano = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        System.out.print("Digite o fabricante do veículo: ");
        veiculo.fabricante = scanner.nextLine();

        System.out.print("Digite a cor do veículo: ");
        veiculo.corVeiculo = scanner.nextLine();

        // Exibindo os dados
        System.out.println("\n--- Dados do Cliente ---");
        System.out.println("Nome: " + cliente.nomeCliente);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Endereço: " + cliente.enderecoCliente);
        System.out.println("Telefone: " + cliente.telefone);
        System.out.println("E-mail: " + cliente.email);

        System.out.println("\n--- Dados do Veículo ---");
        System.out.println("Placa: " + veiculo.placaVeiculo);
        System.out.println("Modelo: " + veiculo.modelo);
        System.out.println("Ano: " + veiculo.ano);
        System.out.println("Fabricante: " + veiculo.fabricante);
        System.out.println("Cor: " + veiculo.corVeiculo);

        scanner.close();
    }
}


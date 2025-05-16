package CursoUdemyJava;

import java.util.Scanner;

public class operadoresTernarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // || = ou
        // && = e

//        int idade = 11;
//        int idadeMinima = 18;
//        int anoNascimento = 2000;
//
//        if (idade > idadeMinima || anoNascimento >= 2007){
//            System.out.println("Ta podendo ser preso");
//        }
//        if (idade > idadeMinima && anoNascimento >= 2007 && idadeMinima < 18){
//            System.out.println("Vai demorar um pouco pra poder conteudo adultoKKKK");
//        }

        // ? = tipo uma pergunta msm
        // : = se nao a de cima pra esse

        System.out.println("Qual a sua idade?: ");
               int years = scanner.nextInt();
        String ehDeMaior = years > 18 ? "Sim é maior" : "Vai ter que esperar fazer 18 rapazKK";
        System.out.println(ehDeMaior);
    }
}

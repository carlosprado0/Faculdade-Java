package CursoUdemyJava;

public class tiposPrimitivos {
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.65; //maiores
        char genero = 'M'; // recebe apenas com aspas simples e um caractere a diferença para o float é que o double recebe números
        boolean ehVerdade = false; // ou true
        String nome = "João";
        long cpf = 12345678999L; //é um int soq maior, porem nao pode comecar com 0

        System.out.println("Idade " + idade);
        System.out.println("Altura " + altura);
        System.out.println("Genero " + genero);
        System.out.println("É verdade? " + ehVerdade);
        System.out.println("Seu nome é? " + nome);
    }
}

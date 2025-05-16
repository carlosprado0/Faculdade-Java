package CursoUdemyJava.ListaExerciosDois;

public class teste7 {
    public static void main(String[] args) {
        int numero = 28;
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == numero) {
            System.out.println(numero + " é um número perfeito");
        } else {
            System.out.println(numero + " não é um número perfeito");
        }
    }
}

package CursoUdemyJava.ListaExerciosDois;

public class teste6 {
    public static void main(String[] args) {
        int numero = 17;
        int soma = 0;

        while (numero != 0){
            soma += numero % 10;
            numero /= 10;
        }
        System.out.println(soma);
    }
}

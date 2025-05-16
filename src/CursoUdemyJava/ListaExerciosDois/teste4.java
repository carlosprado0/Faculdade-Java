package CursoUdemyJava.ListaExerciosDois;
public class teste4 {
    public static void main(String[] args) {
        for (int numero = 2; numero <= 50; numero++){
            boolean ehPrimo = true;
            for (int i = 2; i < numero; i++){
                if (numero % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                System.out.println(numero + " é primo");
            }
        }
    }
}

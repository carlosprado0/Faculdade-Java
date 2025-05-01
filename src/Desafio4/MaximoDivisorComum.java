package Desafio4;

public class MaximoDivisorComum {
    private int primeiroNumero;
    private int segundoNumero;

    // Construtor
    public MaximoDivisorComum(int a, int b) {
        this.primeiroNumero = a;
        this.segundoNumero = b;
    }

    // Métodos de acesso
    public int obterPrimeiroNumero() {
        return primeiroNumero;
    }

    public int obterSegundoNumero() {
        return segundoNumero;
    }

    // Método que calcula o Máximo Divisor Comum
    public int calcular() {
        int a = primeiroNumero;
        int b = segundoNumero;
        int temp;

        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Método main para teste
    public static void main(String[] args) {
        MaximoDivisorComum mdc;

        mdc = new MaximoDivisorComum(3, 6);
        System.out.println(String.format("O MDC entre %d e %d é %d",
                mdc.obterPrimeiroNumero(), mdc.obterSegundoNumero(), mdc.calcular()));

        mdc = new MaximoDivisorComum(15, 25);
        System.out.println(String.format("O MDC entre %d e %d é %d",
                mdc.obterPrimeiroNumero(), mdc.obterSegundoNumero(), mdc.calcular()));

        mdc = new MaximoDivisorComum(4, 9);
        System.out.println(String.format("O MDC entre %d e %d é %d",
                mdc.obterPrimeiroNumero(), mdc.obterSegundoNumero(), mdc.calcular()));
    }
}

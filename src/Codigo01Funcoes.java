public class Codigo01Funcoes {
    public static void main(String[] args) {

        int primeiroNumero = 5;
        int segundoNumero = 10;

        int soma = Soma(primeiroNumero, segundoNumero);
        System.out.println("A soma é: " + soma);

        int multiplicacao = Multiplicacao(primeiroNumero, segundoNumero);
        System.out.println("A multiplicação é: " + multiplicacao);
    }

    public static int Soma(int a, int b) {
        return a + b;
    }

    public static int Multiplicacao(int a, int b) {
        return a * b;
    }
}

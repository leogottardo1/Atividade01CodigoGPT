import java.util.Scanner;

public class Codigo04Funcoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        String resultado = verificarParOuImpar(num);
        System.out.println(resultado);

    }

    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return numero + " é par.";
        } else {
            return numero + " é ímpar.";
        }
    }
}

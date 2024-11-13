import java.util.Scanner;

public class Codigo05Funcoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = calcularSoma(num1, num2);
        System.out.println("A soma é: " + soma);

    }

    public static int calcularSoma(int a, int b) {
        return a + b;
    }
}


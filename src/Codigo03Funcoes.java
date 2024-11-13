import java.util.Scanner;

public class Codigo03Funcoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = calcularAreaRetangulo(largura, altura);
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }

    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }
}


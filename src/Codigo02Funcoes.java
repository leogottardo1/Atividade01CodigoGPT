import java.util.Scanner;

public class Codigo02Funcoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
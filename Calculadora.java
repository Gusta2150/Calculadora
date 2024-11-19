import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operador;
        double resultado;

        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f\n", num1, num2, resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f\n", num1, num2, resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.printf("Resultado: %.2f * %.2f = %.2f\n", num1, num2, resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.2f / %.2f = %.2f\n", num1, num2, resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido. Por favor, escolha entre +, -, * ou /.");
                break;
        }

        scanner.close();
    }
}
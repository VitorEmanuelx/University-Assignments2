import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        System.out.println("Exercicio 5");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        double numero1 = scanner.nextDouble();

        System.out.println("Informe o segundo numero");
        double numero2 = scanner.nextDouble();

        System.out.println("Informe o simbolo da operação (+,-,/,*,^)");
        String operacao = scanner.next();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "^":
                resultado = Math.pow(numero1, numero2);
                break;
        }
        System.out.println("O Seu resultado é: " + resultado);

        scanner.close();
    }

}

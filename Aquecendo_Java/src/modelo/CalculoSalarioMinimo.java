package modelo;

import java.util.Scanner;

public class CalculoSalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define o valor do salário mínimo
        double salarioMinimo = 1412.00;

        // Solicita o salário do usuário
        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        // Calcula a quantidade de salários mínimos que o usuário ganha
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        // Exibe o resultado
        System.out.printf("Você ganha %.2f salários mínimos (1SM=R$%.2f).%n", quantidadeSalariosMinimos, salarioMinimo);

        scanner.close();
    }
}

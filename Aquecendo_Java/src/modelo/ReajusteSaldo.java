package modelo;

import java.util.Scanner;

public class ReajusteSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo ao usuário
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Aplica o reajuste de 1%
        double saldoReajustado = saldo + (saldo * 0.01);

        // Exibe o saldo reajustado
        System.out.println("O saldo com reajuste de 1% é: " + saldoReajustado);

        scanner.close();
    }
}

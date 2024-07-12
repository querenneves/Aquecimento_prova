package modelo;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados de entrada ao usuário
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        // Calcula a idade em dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

        // Exibe o resultado
        System.out.println("A idade em dias é: " + totalDias);

        scanner.close();
    }
}

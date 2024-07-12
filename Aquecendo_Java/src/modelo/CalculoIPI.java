package modelo;
import java.util.Scanner;

public class CalculoIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a porcentagem do IPI
        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        // Solicita os dados da peça 1
        System.out.print("Digite o código da peça 1: ");
        int codigo1 = scanner.nextInt();
        
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitario1 = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidade1 = scanner.nextInt();

        // Solicita os dados da peça 2
        System.out.print("Digite o código da peça 2: ");
        int codigo2 = scanner.nextInt();
        
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitario2 = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidade2 = scanner.nextInt();

        // Calcula o valor total a ser pago
        double valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi / 100 + 1);

        // Exibe o resultado
        System.out.println("O valor total a ser pago é: " + valorTotal);

        scanner.close();
    }
}

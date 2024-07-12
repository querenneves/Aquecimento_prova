package modelo;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Calcula o antecessor e o sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Exibe os resultados
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        scanner.close();
    }
}

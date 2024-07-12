package modelo;

public class MediaAritmetica {
    public static void main(String[] args) {
        // Números para a primeira média
        int num1 = 8;
        int num2 = 9;
        int num3 = 7;
        
        // Números para a segunda média
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;

        // Calculando as médias
        double media1 = (num1 + num2 + num3) / 3.0;
        double media2 = (num4 + num5 + num6) / 3.0;

        // Calculando a soma das médias
        double somaDasMedias = media1 + media2;

        // Calculando a média das médias
        double mediaDasMedias = somaDasMedias / 2.0;

        // Exibindo os resultados
        System.out.println("A média dos números 8, 9 e 7 é: " + media1);
        System.out.println("A média dos números 4, 5 e 6 é: " + media2);
        System.out.println("A soma das duas médias é: " + somaDasMedias);
        System.out.println("A média das médias é: " + mediaDasMedias);
    }
}

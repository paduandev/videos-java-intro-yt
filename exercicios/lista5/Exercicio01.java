import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        final int TAM = 3;
        int matriz[][] = new int[TAM][TAM];
        Scanner scanner = new Scanner(System.in);
        int soma;

        System.out.println("Informe os valores da matriz: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.printf("posição %d:%d: ", linha, coluna);
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        scanner.close();

        soma = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                soma += matriz[linha][coluna];
            }
        }
        System.out.println("Soma de todos os valores: " + soma);

        for (int linha = 0; linha < matriz.length; linha++) {
            soma = 0;
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                soma += matriz[linha][coluna];
            }
            System.out.println("Soma da linha: " + linha + " = " + soma);
        }

        for (int coluna = 0; coluna < matriz.length; coluna++) {
            soma = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += matriz[linha][coluna];
            }
            System.out.println("Soma da coluna: " + coluna + " = " + soma);
        }

        System.out.println("Diagonal principal:");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print( matriz[linha][linha] +" ");
        }
        System.out.println();

        System.out.println("Diagonal secundária:");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print( matriz[linha][TAM-1-linha] +" ");
        }
    }
}
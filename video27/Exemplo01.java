import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];      

        System.out.println("Informe 9 valores:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        scanner.close();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                 System.out.printf("%3d", matriz[linha][coluna]);
            }
            System.out.println();
        }

    }
}
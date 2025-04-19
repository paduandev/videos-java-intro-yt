import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        final int TOTAL_NUMEROS = 10;
        Scanner scanner = new Scanner(System.in);
        int numero;
        int qtdePositivos = 0;

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.println("Informe o " + (i+1) + "º número: ");
            numero = scanner.nextInt();
            if(numero >= 0) {
                qtdePositivos++;
            }
        }
        scanner.close();

        System.out.println("O total de positivos é " + qtdePositivos);
        System.out.println("O total de negativos é " + (TOTAL_NUMEROS - qtdePositivos));
    }
}

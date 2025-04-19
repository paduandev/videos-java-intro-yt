import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1, contPares = 0, contTotalNumeros = 0;
        double mediaPares = 0;

        while (numero != 0) {
            System.out.println("Digite o valor (0 para terminar):");
            numero = scanner.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    mediaPares += numero;
                    contPares++;
                }
                contTotalNumeros++;
            }
        }
        scanner.close();

        if (contPares > 0) {
            mediaPares /= contPares;
            System.out.println("Total de pares: " + contPares);
            System.out.println("A média é " + mediaPares);

        } else {
            System.out.println("Não foram digitados números pares");
        }

        if (contTotalNumeros > 0) {
            double porcentagem = ((double) (contTotalNumeros - contPares)) / contTotalNumeros;
            System.out.println("Porcentagem de ímpares: " + porcentagem);
        }
    }
}

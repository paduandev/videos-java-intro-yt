import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;

        // while (numeroDigitado <= 0) {
        // System.out.println("Digite um valor inteiro maior que zero");
        // numeroDigitado = scanner.nextInt();
        // }
        do {
            System.out.println("Digite um valor inteiro maior que zero");
            numeroDigitado = scanner.nextInt();
        } while (numeroDigitado <= 0);

        System.out.println("Obrigado.");

        scanner.close();
    }
}
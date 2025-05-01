import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite o valor inteiro:");
        numero = scanner.nextInt();
        scanner.close();

        System.out.println(inverter(numero));
    }

    static String inverter(int numero) {
        String texto = Integer.toString(numero);
        char vetor[] = texto.toCharArray();
        String saida = "";

        for (int i = vetor.length-1; i >= 0 ; i--) {
            saida += vetor[i] + " ";
        }
        saida = saida.trim();
        return saida;
    }
}
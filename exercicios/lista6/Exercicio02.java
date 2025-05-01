import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("Informe um valor inteiro: ");
        valor = scanner.nextInt();
        scanner.close();

        int resultado = fatorial(valor);
        System.out.println(valor+"! = " + resultado);
    }

    static int fatorial(int numero) {
        int fat = 1;
        for (int i = 1; i <= numero; i++) {
            fat *= i;
        }
        return fat;
    }
}
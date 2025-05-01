import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("Informe um valor inteiro: ");
        valor = scanner.nextInt();
        scanner.close();

        if(ehPar(valor)) {
            System.out.println(valor + " é par");
        } else {
            System.out.println(valor + " é impar");
        }
    }

    static boolean ehPar(int numero) {
        if(numero % 2 == 0) {
            return true;
        }
        return false;
    }
}
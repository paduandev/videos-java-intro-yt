import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;

        System.out.println("Digite o limite: ");
        limite = teclado.nextInt();
        teclado.close();

        System.out.print("1");

        for(int numero = 2; numero <= limite; ) {
            System.out.print(", " + numero);
            numero = numero * 2;
        }

    }
}

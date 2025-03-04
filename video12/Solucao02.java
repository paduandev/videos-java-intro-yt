import java.util.Scanner;

public class Solucao02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String texto;

        // texto = teclado.nextLine();
        // numero = Integer.parseInt(texto);

        numero = Integer.parseInt(teclado.nextLine());

        texto = teclado.nextLine();

        System.out.println(texto + " " + numero);

        teclado.close();
    }
}

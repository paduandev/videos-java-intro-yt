import java.util.Scanner;

public class Problema {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String texto;

        numero = teclado.nextInt();
        texto = teclado.nextLine(); // esse nextLine não permitirá a digitação

        System.out.println(texto + " " + numero);

        teclado.close();
    }
}
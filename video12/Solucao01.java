import java.util.Scanner;

public class Solucao01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String texto;

        numero = teclado.nextInt();
        teclado.nextLine(); // leitura extra para "limpar" o buffer

        texto = teclado.nextLine();

        System.out.println(texto + " " + numero);

        teclado.close();
    }
}

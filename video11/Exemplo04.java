import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int numero;


        numero = entrada.nextInt();
        entrada.nextLine();
        texto = entrada.nextLine();

        System.out.println(texto);
        System.out.println(numero);

        entrada.close();
    }
}

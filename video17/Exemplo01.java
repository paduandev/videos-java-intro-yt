import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 1;
        int limite;

        System.out.print("Informe o limite: ");
        limite = entrada.nextInt();

        while (cont <= limite) {
            System.out.println(cont);
            cont++;
        }

        entrada.close();
    }
}
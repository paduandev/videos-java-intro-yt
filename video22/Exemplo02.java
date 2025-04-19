import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;


        for (int i = 0; i < 5; ) {
            System.out.println("Digite um valor inteiro positivo");
            numero = scanner.nextInt();
            if(numero <= 0) {
                continue;
            }
            System.out.println("Processando o valor " + numero);
            i++;
        }
        System.out.println("Fim");

        scanner.close();
    }
}
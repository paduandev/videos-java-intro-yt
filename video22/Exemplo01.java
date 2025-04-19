import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor inteiro (0 = fim)");
            numero = scanner.nextInt();
            if(numero == 0) {
                break;
            }
        }
        System.out.println("Fim");

        scanner.close();
    }
}
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        scanner.close();

        for(int i = numeros.length; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

    }
}
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite outro valor inteiro:");
        numero2 = entrada.nextInt();

        System.out.println("os números digitados foram:");
        System.out.println(numero1);
        System.out.println(numero2);

        entrada.close();
    }
}
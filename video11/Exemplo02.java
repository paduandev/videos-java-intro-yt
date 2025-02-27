import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        int numero1;
        double numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        numero1 = entrada.nextInt();

        System.out.println("Digite um valor com decimal:");
        numero2 = entrada.nextDouble();

        System.out.println("os números digitados foram:");
        System.out.println(numero1);
        System.out.println(numero2);

        entrada.close();
    }
}

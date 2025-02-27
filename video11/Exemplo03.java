import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        String sobrenome;

        System.out.println("Digite seu nome:");
        // nome = entrada.nextLine();
        nome = entrada.next();
        sobrenome = entrada.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome);

        entrada.close();
    }
}

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("Informe a sua idade:");
        idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Você já pode dirigir.");
        } else {
            System.out.println("Você ainda precisa de carona.");
        }
        
        teclado.close();
    }
}
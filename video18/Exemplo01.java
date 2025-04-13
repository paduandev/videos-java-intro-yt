import java.util.Scanner;

/*
 * Soma os números inteiros de 1 até o limite, não incluindo o limite
 * Ex:
 * Dado o limite 5: 
 * soma = 1 + 2 + 3 + 4 = 10
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 1;
        int soma = 0;
        int limite;

        System.out.print("Informe o limite: ");
        limite = entrada.nextInt();
        entrada.close();

        System.out.println("Valor inicial: " + limite);

        while (cont < limite) {
            System.out.println("cont = " + cont);
            soma += cont;
            cont++;
        }

        System.out.println("Valor final do contador: " + cont);

        System.out.println("soma = " + soma);
    }
}
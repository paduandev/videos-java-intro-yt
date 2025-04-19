import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabuada, cont;

        System.out.println("Qual a tabuada?");
        tabuada = teclado.nextInt();
        teclado.close();

        cont = 0;
        while (cont < 11) {
            System.out.println(tabuada + " x " + cont + " = " + (tabuada * cont));
            cont++;
        }

        System.out.println("------");

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d x %2d = %2d\n", tabuada, i, tabuada * i);
        }

    }
}
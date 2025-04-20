import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media;
        int acimaDaMedia;
        double notas[] = new double[5];

        System.out.println("Digite as " + notas.length + " notas");
        for (int i = 0; i < notas.length; i++) {
            notas[i] =  scanner.nextDouble();
        }
        scanner.close();

        media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
            media += notas[i];
        }
        media /= notas.length;
        System.out.println("Média = " + media);

        acimaDaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Notas acima da média: " + acimaDaMedia);

    }
}

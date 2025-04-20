import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado;
        int faces[] = new int[6];


        do {

            do {
                System.out.println("Digite o lado sorteado:");
                lado = scanner.nextInt();
            } while (lado < 0 || lado > 6);
            if(lado != 0) {
                System.out.println("Contabilizado");
                faces[lado-1]++;
            }
        } while (lado != 0);
        scanner.close();

        for (int i = 0; i < faces.length; i++) {
            System.out.printf("%d - %2d vezes: ", i+1, faces[i]);
            for (int j = 0; j < faces[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for (int face : faces) {
        //     System.out.println(face);
        // }
    }
}

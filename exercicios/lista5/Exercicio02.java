import java.util.Scanner;

/*   
 O método Math.random() gera números aleatórios no intervalo de 0 à 1.
 Por exemplo, 0.12322329
 Ao multiplicar por 100 e converter para int estamos separando 2 dígitos desse número
 Por exemplo, 12.322319 ==> 12
*/
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, pares, maior;

        System.out.println("Qual o tamanho da matriz? ");
        tamanho = scanner.nextInt();
        scanner.close();

        // A declaração é feita depois, pois antes não sabemos o tamanho
        int matriz[][] = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // *veja a explicação no início do arquivo
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("%3d",matriz[i][j]);
            }
            System.out.println();
        }

        maior = matriz[0][0];
        for (int i = 0; i < tamanho; i++) {
            pares = 0;
            for (int j = 0; j < tamanho; j++) {
                if(matriz[i][j] % 2 == 0) {
                    pares++;
                }
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.printf("A linha %d tem %d número(s) par(es)\n", i, pares);
        }
        System.out.println("O maior valor da matriz é " + maior);

    }
}

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        char letra;
        int countLetras = 0;
        int countTotalLetras = 0;

        System.out.println("Digite a frase: ");
        frase = scanner.nextLine();

        // Uma String pode ser entendida como um vetor de letras
        // Mas não podemos usar a sintaxe [0]
        // Usamos charAt(0) por exemplo para o primeiro caracter da frase
        System.out.println("Digite a letra:");
        letra = scanner.nextLine().charAt(0);

        scanner.close();

        // Podemos transformar uma String em um vetor de caracteres da seguinte forma:
        char caracteres[] = frase.toCharArray();

        for (char c : caracteres) {
            if(c != ' ') {
                countTotalLetras++;
                if(c == letra) {
                    countLetras++;
                }
            }
        }
        double percentual = ((double) countLetras / countTotalLetras) * 100;

        System.out.printf("Percentual: %.2f %%", percentual);
    }
}

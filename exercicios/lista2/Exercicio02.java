import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pontos, chavesEncontradas;
        boolean passouDeFase;

        System.out.println("Quantos pontos foram feitos?");
        pontos = teclado.nextInt();
        System.out.println("Quantas chaves foram encontradas?");
        chavesEncontradas = teclado.nextInt();

        passouDeFase = (pontos > 1000) && (chavesEncontradas  == 3);
        
        if(passouDeFase == true) {
            System.out.println("O jogador passou para a fase 2");
        } else {
            System.out.println("Não foi para a fase 2. Tente novamente");
        }

        teclado.close();
    }
}

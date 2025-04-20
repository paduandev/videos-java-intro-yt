import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomes[] = { "Ana", "Beatriz", "Carlos", "Daniel", "Eduardo", "Fabio", "Rodrigo", "Gustavo", "Guilherme",
                "Armando", "Daniel" };
        String nome;

        System.out.println("Digite o nome a ser procurado:");
        nome = scanner.nextLine();
        scanner.close();

        boolean achei = false;

        for (int i = 0; i < nomes.length; i++) {
            if(nome.equalsIgnoreCase(nomes[i])) {                
                achei = true;
                break;
            } 
        }
        
        if(achei) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }
}
public class Exemplo01 {

    public static void main(String[] args) {
        double nota = 3;

        if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            if(nota >= 4) {
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");
            }
        }

        System.out.println("Final do programa");
    }
}
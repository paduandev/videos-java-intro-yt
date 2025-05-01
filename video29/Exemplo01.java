public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        linha2(5);
        linha2(15);
        linha3(10, '*');

        int resposta;
        resposta = soma(4, 6);
        System.out.println("Soma = " + resposta);
    }

    static void linha() {
        System.out.println("-----------------------");
    }

    static void linha2(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char simbolo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    static int soma(int n1, int n2) {
        int resultado;
        resultado = n1 + n2;
        return resultado;
    }
}
public class Exemplo02 {
    public static void main(String[] args) {
        // cria (declara) duas variáveis inteiras
        int numero1, numero2;

        numero1 = 10;

        numero2 = numero1; // copia o conteúdo da variável numero1 para a variável numero2

        System.out.println(numero1);
        System.out.println(numero2);

        numero1 = 20;

        System.out.println(numero1);
        System.out.println(numero2);
    }
}

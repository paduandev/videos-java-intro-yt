public class Exemplo04 {
    public static void main(String[] args) {
        int numero;
        double numeroDouble;
        String texto;

        numero = 10;
        numeroDouble = 12.65; 

        texto = String.valueOf(numero);

        System.out.println(numero);
        System.out.println(texto);

        texto = String.valueOf(numeroDouble);

        System.out.println(numeroDouble);
        System.out.println(texto);
    }
}

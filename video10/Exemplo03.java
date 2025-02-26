public class Exemplo03 {
    public static void main(String[] args) {
        int numero;
        double numeroDouble;
        String texto;

        numero = 10;
        numeroDouble = 12.65;

        texto = Integer.toString(numero);

        System.out.println(numero);
        System.out.println(texto);

        texto = Double.toString(numeroDouble);
        System.out.println(numeroDouble);
        System.out.println(texto);
    }
}

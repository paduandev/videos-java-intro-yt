public class Exemplo01 {

    public static void main(String[] args) {
        int numero = 10;

        if(numero >= 0) {
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }

        String resposta;
        resposta = (numero >= 0) ? "positivo" : "negativo";

        System.out.println(resposta);
    }
}
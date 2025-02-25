public class Exercicio {
    public static void main(String[] args) {
        int pontos;
        boolean achouChaveDourada, passouDeFase;

        pontos = 1500;
        achouChaveDourada = false;

        passouDeFase = (pontos > 1000) && (achouChaveDourada == true);

        System.out.println("Passou de fase? " + passouDeFase);
    }
}

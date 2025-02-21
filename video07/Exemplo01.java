public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println( 10 > 5 && 8 > 2 );
        System.out.println( 10 > 5 && 8 > 20 );
        System.out.println( 10 > 50 && 8 > 2 );
        System.out.println( 10 > 50 && 8 > 20 );

        System.out.println("----------");

        System.out.println( 10 > 5 || 8 > 2 );
        System.out.println( 10 > 5 || 8 > 20 );
        System.out.println( 10 > 50 || 8 > 2 );
        System.out.println( 10 > 50 || 8 > 20 );

        System.out.println("------");

        System.out.println(!true);
        System.out.println(!false);
    }
}
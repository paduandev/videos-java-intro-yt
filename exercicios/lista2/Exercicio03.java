/*
Escreva um programa que leia a partir do teclado três comprimentos de lados de um triângulo a, b, e c 
(pode usar valores inteiros). Determine a seguir o tipo de triângulo formado de acordo com 
os seguintes critérios:

- Se a > b+c (para cada lado vale o mesmo) não formam triângulo algum.

- Se forem todos iguais formam um triângulo equilátero. 
- Se a = b ou b = c ou a = c então formam um triângulo isósceles.
- Caso contrário forma um triângulo escaleno.

 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("Informe o valor do lado 1 do triângulo");
        lado1 = teclado.nextInt();
        System.out.println("Informe o valor do lado 2 do triângulo");
        lado2 = teclado.nextInt();
        System.out.println("Informe o valor do lado 3 do triângulo");
        lado3 = teclado.nextInt();

        boolean naoFormamTriangulo = ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2));

        if (naoFormamTriangulo) {
            System.out.println("Não formam um triângulo");
        } else {
            if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("Triângulo equilátero");
            } else {
                if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
                    System.out.println("Triângulo isósceles");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            }
        }

        teclado.close();
    }
}
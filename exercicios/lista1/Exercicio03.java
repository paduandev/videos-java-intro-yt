/*
Sabe-se que um quilowatt de energia custa 1/500 do salário mínimo.  
Faça um programa que leia a partir do teclado o valor do salário mínimo e a quantidade 
de quilowatts consumida por uma residência, e então exiba: 
a) O valor, em reais, de cada quilowatt 
b) O valor, em reais, a ser pago por essa residência 
c) O valor, em reais, a ser pago com desconto de 10% 

 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo;
        int kwConsumidos;
        double valorPorKw, valorAPagar, valorComDesconto;

        // entrada
        System.out.println("Informe o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Informe quantos KW foram consumidos:");
        kwConsumidos = entrada.nextInt();

        // processamento
        valorPorKw = salarioMinimo / 500;
        valorAPagar = valorPorKw * kwConsumidos;
        valorComDesconto = valorAPagar * 0.9;

        // saída
        System.out.println("Valor por KW: " + valorPorKw);
        System.out.println("Valor Total a pagar: " + valorAPagar);
        System.out.println("Valor com desconto: " + valorComDesconto);

        entrada.close();
    }
}

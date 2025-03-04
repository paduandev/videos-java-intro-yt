/*
 Faça um programa que leia a partir do teclado o salário de um funcionário. Sabendo 
que o salário do funcionário deve ter um aumento de 25%, calcule e exiba o novo 
salário. 
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioAtual, salarioCorrigido;

        // entrada
        System.out.println("Informe o salário atual: ");
        salarioAtual = entrada.nextDouble();

        // processamento
        salarioCorrigido = salarioAtual * 1.25; // o mesmo que (salarioAtual + salarioAtual * 0.25)

        // saída
        System.out.println("O novo salário será: " + salarioCorrigido);

        entrada.close();
    }
}

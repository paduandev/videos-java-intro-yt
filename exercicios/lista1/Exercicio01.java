/*
Faça um programa que leia a partir do teclado duas notas de um aluno, calcule e exiba 
a média aritmética do aluno.
 */

import java.util.Scanner;

public class Exercicio01 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        // entrada
        System.out.println("Digite a primeira nota do aluno:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = entrada.nextDouble();

        // processamento
        media = (nota1 + nota2) / 2;

        // saída
        System.out.println("A média do aluno é: " + media);

        entrada.close();
    }
 }
/*
Escreva um programa que leia do usuário largura e altura e imprima um retângulo na tela, como, por exemplo,
largura 5 e altura 7:
XXXXX
X   X
X   X
X   X
X   X
X   X
XXXXX
 */

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        int largura;
        int altura;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da largura do retângulo"); // Número de "X" na parte superior e inferior
        largura = scan.nextInt ();

        System.out.println("Digite o valor da altura do retângulo"); // Número total de linhas
        altura = scan.nextInt ();

                // Desenha a parte (linha) superior do retângulo
        for (int i = 0; i < largura; i++) {
            System.out.print("X ");
        }
        System.out.println();

        // Desenha as laterais do retângulo
        for (int i = 2; i < altura; i++) {
            System.out.print("X ");
            for (int j = 2; j < largura; j++) {
                System.out.print("  "); // Espaços com X no meio (colunas)
            }
            System.out.println("X ");
        }

        // Desenha a parte (linha) inferior do retângulo
        for (int i = 0; i < largura; i++) {
            System.out.print("X ");
        }
    }
}

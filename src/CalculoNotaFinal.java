/*
Um professor avalia seus alunos através dos seguintes critérios:
a) Quatro notas de exercícios de 0 a 100, com peso de 20% na nota final.
b) Duas notas de prova de 0 a 100, com peso de 60% na nota final.
c) Um trabalho prático de 20 pontos.
Elabore um programa que lê as notas de um aluno, calcula e mostra na tela sua nota final (em 100 pontos),
formatada com duas casas decimais e devidamente ponderada pelos pesos.
 */
import java.util.Scanner;

public class CalculoNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaExercicios = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota do exercício " + i + " (0-100): ");
            somaExercicios += scanner.nextDouble();
        }
        double mediaExercicios = somaExercicios / 4;

        double somaProvas = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite a nota da prova " + i + " (0-100): ");
            somaProvas += scanner.nextDouble();
        }
        double mediaProvas = somaProvas / 2;

        System.out.print("Digite a nota do trabalho prático (0-20): ");
        double notaTrabalho = scanner.nextDouble();

        double notaFinal = (mediaExercicios * 0.2) + (mediaProvas * 0.6) + ((notaTrabalho / 20) * 20);

        System.out.printf("Nota final: %.2f pontos%n", notaFinal);

        scanner.close();
    }
}


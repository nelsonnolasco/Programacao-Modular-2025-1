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


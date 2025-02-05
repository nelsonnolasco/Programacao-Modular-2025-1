//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibir menu
            System.out.println("\nMenu:");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - O maior de dois números");
            System.out.println("3 - Somar N números");
            System.out.println("4 - Contador de pares de uma sequência");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    somarDoisNumeros(scanner);
                    break;
                case 2:
                    maiorDeDoisNumeros(scanner);
                    break;
                case 3:
                    somarNNumeros(scanner);
                    break;
                case 4:
                    contadorPares(scanner);
                    break;
                case 0:
                    System.out.println("Saindo... Fui!!! \nBy Nelson de Campos Nolasco");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void somarDoisNumeros(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 + num2));
    }

    private static void maiorDeDoisNumeros(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double maior = Math.max(num1, num2);
        System.out.println("O maior número é: " + maior);
    }

    private static void somarNNumeros(Scanner scanner) {
        System.out.print("Quantos números deseja somar? ");
        int n = scanner.nextInt();
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            soma += scanner.nextDouble();
        }

        System.out.println("A soma total é: " + soma);
    }

    private static void contadorPares(Scanner scanner) {
        System.out.print("Quantos números terá a sequência? ");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            if (scanner.nextInt() % 2 == 0) {
                count++;
            }
        }

        System.out.println("Quantidade de números pares: " + count);
    }
}
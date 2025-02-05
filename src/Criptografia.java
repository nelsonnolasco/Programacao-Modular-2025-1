import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string a ser criptografada: ");
        String input = scanner.nextLine();

        String criptografada = criptografar(input);

        System.out.println("String criptografada: " + criptografada);

        scanner.close();
    }

    private static String criptografar(String texto) {
        int bloco = 5;
        int linhas = (int) Math.ceil((double) texto.length() / bloco);
        char[][] matriz = new char[linhas][bloco];

        // Preenche a matriz com espaços em branco
        for (int i = 0, index = 0; i < linhas; i++) {
            for (int j = 0; j < bloco; j++) {
                if (index < texto.length()) {
                    matriz[i][j] = texto.charAt(index++);
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Lendo por colunas e concatenando
        StringBuilder resultado = new StringBuilder();
        for (int j = 0; j < bloco; j++) {
            if (j > 0) {
                resultado.append("*");
            }
            for (int i = 0; i < linhas; i++) {
                resultado.append(matriz[i][j]);
            }
        }

        return resultado.toString();
    }
}

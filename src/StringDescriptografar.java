/*
Crie agora um programa que recebe uma string criptografada com o método descrito na questão anterior e
retorne uma string "simples" com a mensagem original.
Questão anterior abaixo:
Crie um programa que embaralha ("criptografa") uma string usando o seguinte algoritmo: a string é reescrita
em blocos de 5 caracteres, sendo as novas palavras obtidas lendo-se cada coluna resultante, separadas por
asteriscos. Por exemplo, se a string for "mensagem secreta":
mensa
gem s
ecret
a
A criptografia retorna "mgea*eec *nmr*s e *ast *" (atenção para os espaços em branco).
 */
import java.util.Scanner;

public class StringDescriptografar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string a ser criptografada: ");
        String input = scanner.nextLine();

        String criptografada = criptografar(input);
        System.out.println("String criptografada: " + criptografada);

        System.out.print("Digite a string a ser descriptografada: ");
        String inputCriptografado = scanner.nextLine();

        String descriptografada = descriptografar(inputCriptografado);
        System.out.println("String descriptografada: " + descriptografada);

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

    private static String descriptografar(String textoCriptografado) {
        String[] blocos = textoCriptografado.split("\\*");
        int linhas = blocos[0].length();
        int colunas = blocos.length;
        char[][] matriz = new char[linhas][colunas];

        // Preencher a matriz por colunas
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                if (i < blocos[j].length()) {
                    matriz[i][j] = blocos[j].charAt(i);
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Ler a matriz por linhas para reconstruir a string original
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.append(matriz[i][j]);
            }
        }

        return resultado.toString().trim();
    }
}

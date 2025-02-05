public class Retangulo {
    public static void main(String[] args) {
        int largura = 5; // Número de "X" na parte superior e inferior
        int altura = 7; // Número total de linhas

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

package Jogo;

public class Tabuleiro {
    private Carta[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Carta[3][3];
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            // Exibir a parte superior das cartas
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == null) {
                    System.out.print("   ---   ");
                } else {
                    Carta c = tabuleiro[i][j];
                    System.out.print("   " + formatarValor(c.getCima()) + "   ");
                }
            }
            System.out.println();

            // Exibir a parte do meio (esquerda e direita)
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == null) {
                    System.out.print("|       | ");
                } else {
                    Carta c = tabuleiro[i][j];
                    System.out.print("|" + formatarValor(c.getEsquerda()) + "     " + formatarValor(c.getDireita()) + "| ");
                }
            }
            System.out.println();

            // Exibir a parte inferior das cartas
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == null) {
                    System.out.print("   ---   ");
                } else {
                    Carta c = tabuleiro[i][j];
                    System.out.print("   " + formatarValor(c.getBaixo()) + "   ");
                }
            }
            System.out.println();
        }
    }

    private String formatarValor(int valor) {
        return (valor == 10) ? "A" : String.valueOf(valor);
    }

    public boolean posicionarCarta(int linha, int coluna, Carta carta) {
        if (tabuleiro[linha][coluna] == null) {
            tabuleiro[linha][coluna] = carta;
            return true;
        }
        return false;
    }

    public Carta getCarta(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }
}

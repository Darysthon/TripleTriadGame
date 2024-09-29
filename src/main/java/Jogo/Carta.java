package Jogo;

public class Carta {
    private String nome;
    private int cima;
    private int baixo;
    private int esquerda;
    private int direita;

    public Carta(String nome, int cima, int baixo, int esquerda, int direita) {
        this.nome = nome;
        this.cima = cima;
        this.baixo = baixo;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public String getNome() {
        return nome;
    }

    public int getCima() {
        return cima;
    }

    public int getBaixo() {
        return baixo;
    }

    public int getEsquerda() {
        return esquerda;
    }

    public int getDireita() {
        return direita;
    }

    @Override
    public String toString() {
        return nome + " [" + formatarValor(cima) + ", " + formatarValor(baixo) + ", " + formatarValor(esquerda) + ", " + formatarValor(direita) + "]";
    }

    private String formatarValor(int valor) {
        return (valor == 10) ? "A" : String.valueOf(valor);
    }
}

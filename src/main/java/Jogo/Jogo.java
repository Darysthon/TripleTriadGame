package Jogo;

import java.util.Scanner;

public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;
    private Scanner scanner;

    public Jogo(String nomeJogador1, String nomeJogador2) {
        this.jogador1 = new Jogador(nomeJogador1);
        this.jogador2 = new Jogador(nomeJogador2);
        this.tabuleiro = new Tabuleiro();
        this.scanner = new Scanner(System.in);

        // Adicionar cartas aos jogadores
        inicializarCartasJogador(jogador1);
        inicializarCartasJogador(jogador2);
    }

    private void inicializarCartasJogador(Jogador jogador) {
        jogador.adicionarCarta(new Carta("Dragão", 3, 8, 7, 2));
        jogador.adicionarCarta(new Carta("Chocobo", 4, 6, 1, 7));
        jogador.adicionarCarta(new Carta("Golem", 6, 5, 9, 1));
        jogador.adicionarCarta(new Carta("Leviatã", 10, 3, 5, 9));
        jogador.adicionarCarta(new Carta("Ifrit", 8, 6, 4, 7));
    }

    public void iniciarJogo() {
        Jogador jogadorAtual = jogador1;
        int turnos = 0;

        while (turnos < 9) {
            tabuleiro.exibirTabuleiro();
            jogadorAtual.exibirCartas();

            // Escolher carta
            System.out.println(jogadorAtual.getNome() + ", escolha uma carta (1-5):");
            int cartaEscolhida = scanner.nextInt() - 1;
            Carta carta = jogadorAtual.escolherCarta(cartaEscolhida);

            // Escolher posição no tabuleiro
            System.out.println("Escolha uma posição no tabuleiro (linha e coluna, 0-2):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            // Posicionar carta no tabuleiro
            if (tabuleiro.posicionarCarta(linha, coluna, carta)) {
                turnos++;
                jogadorAtual = alternarJogador(jogadorAtual);
            } else {
                System.out.println("Posição já ocupada! Tente novamente.");
            }
        }

        tabuleiro.exibirTabuleiro();
        System.out.println("Jogo finalizado!");
    }

    private Jogador alternarJogador(Jogador jogadorAtual) {
        return (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }
}

package Jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Jogador 1:");
        String nomeJogador1 = scanner.nextLine();

        System.out.println("Digite o nome do Jogador 2:");
        String nomeJogador2 = scanner.nextLine();

        Jogo jogo = new Jogo(nomeJogador1, nomeJogador2);
        jogo.iniciarJogo();
    }
}

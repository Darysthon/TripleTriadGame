package Jogo;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> cartas;

    public Jogador(String nome) {
        this.nome = nome;
        this.cartas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public Carta escolherCarta(int indice) {
        return cartas.remove(indice);
    }

    public void exibirCartas() {
        System.out.println("Cartas de " + nome + ":");
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println((i + 1) + ": " + cartas.get(i));
        }
    }
}

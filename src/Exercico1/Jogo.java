package Exercico1;

import java.util.Date;

public class Jogo {


    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(5,
                "Matheus Augusto",
                "THEUZIN TUBARÃO",
                new Date(1976, 11, 17),
                10,
                "ATACANTE",
                100,
                2,
                0);
        Jogador jogador2 = new Jogador(5,
                "Augusto Matheus",
                "TUBARÃO THEUZIN",
                new Date(1976, 11, 17),
                9,
                "MATADOR",
                90,
                1,
                0);
        System.out.println(jogador1.toString());
        System.out.println(jogador2.toString());

    }
}

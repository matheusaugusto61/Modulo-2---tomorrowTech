package Exercicio4;

import Exercicio4.Personagem;
import Exercicio4.TipoAtaque;

public class Cobra extends Personagem {

    @Override
    public void atacar(Personagem heroi){
        heroi.apanhar(10, TipoAtaque.VENENO);
        System.out.println("Causou 10 de dano e agora o " + heroi.getNome() + " está envenenado");
    }

    @Override
    public void apanhar(int dano, TipoAtaque tipoAtaque) {
        this.vida -= dano;
        verificaSeEstaMorto();
    }

    @Override
    public void interagir() {
        System.out.println("Se você acender a chama a maldição acaba");
    }
}

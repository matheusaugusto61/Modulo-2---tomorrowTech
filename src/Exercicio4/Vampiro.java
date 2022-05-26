package Exercicio4;

public class Vampiro extends Personagem {

    @Override
    public void atacar(Personagem heroi){
        heroi.apanhar(20, TipoAtaque.SANGRENTO);
        System.out.println("Causou 20 de dano e agora o " + heroi.getNome() + " está sangrando");
    }

    @Override
    public void apanhar(int dano, TipoAtaque tipoAtaque) {
        this.vida -= dano;
        verificaSeEstaMorto();
    }

    @Override
    public void interagir() {
        System.out.println("O que é um homem?");
    }
}

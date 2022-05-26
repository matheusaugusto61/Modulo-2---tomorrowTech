package Exercicio4;

public class Gigante extends Personagem {

    @Override
    public void atacar(Personagem heroi){
        heroi.apanhar(25, TipoAtaque.PANCADA);
        System.out.println("Causou 25 de dano e agora o " + heroi.getNome() + " está atordoado");
    }

    @Override
    public void apanhar(int dano, TipoAtaque tipoAtaque) {
        this.vida -= dano;
        verificaSeEstaMorto();
    }

    @Override
    public void interagir() {
        System.out.println("Me desculpe");
    }
}

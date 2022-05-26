package Exercicio4;

public class Heroi extends Personagem{


    public Heroi(){
        this.vida = 100;
        this.isDead = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getVida(){
        return this.vida;
    }

    public boolean verificaSeEstaMorto(){
        if(this.vida>0){
            this.isDead=false;
        }else{
            this.isDead=true;
        }
        return this.isDead;
    }

    @Override
    public void apanhar(int dano, TipoAtaque tipoAtaque){
        this.vida -= dano;
        verificaSeEstaMorto();
    }

    @Override
    public void atacar(Personagem personagem) {

    }

    @Override
    public void interagir() {
        System.out.println("Eu sou o milior");
    }
}

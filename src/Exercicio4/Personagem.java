package Exercicio4;

public abstract class Personagem {

    protected String nome;
    protected int vida;
    protected boolean isDead;

    public Personagem(){
        this.vida = 100;
        this.isDead = false;
    }

    public abstract void atacar(Personagem personagem);

    public abstract void apanhar(int dano, TipoAtaque tipoAtaque);

    public abstract void interagir();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected boolean verificaSeEstaMorto(){
        if(this.vida>0){
            this.isDead=false;
        }else{
            this.isDead=true;
        }
        return this.isDead;
    }
}

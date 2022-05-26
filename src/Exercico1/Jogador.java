package Exercico1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Jogador {

    int id;
    String nome;
    String apelido;
    Date dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
    }

    public Jogador() {}

    public String retornarDataComoString(Date date){
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        String stringData = simpleDate.format(date);
        return stringData;
    }

    public boolean verificaCondicaoJogador(){
        if(cartoesAmarelos==3 || cartoesAmarelos == 1){
            this.suspenso = true;
        }
        return this.suspenso;
    }

    public void aplicarCartaoAmarelo(int quantidade){
        this.cartoesAmarelos += quantidade;
        verificaCondicaoJogador();
    }

    public void aplicarCartaoVermelho(){
        this.cartaoVermelho = 1;
    }

    public void cumprirSuspensao(){
        this.cartoesAmarelos=0;
        this.cartaoVermelho=0;
        this.suspenso=false;
    }

    public void sofrerLesao(){
        double probabilidade = Math.random();
        if(probabilidade <= 0.4){
            this.qualidade -= 1;
        }else if(probabilidade > 0.4 && probabilidade <=0.7){
            this.qualidade -= 2;
        }else if(probabilidade > 0.7 && probabilidade <=0.85){
            this.qualidade -= (this.qualidade * 0.05);
        }else if(probabilidade > 0.85 && probabilidade <=0.95){
            this.qualidade -= (this.qualidade * 0.1);
        }else if(probabilidade > 0.95 && probabilidade <=1){
            this.qualidade -= (this.qualidade * 0.15);
        }
        if(this.qualidade<0){
            this.qualidade=0;
        }
    }

    public void executarTreinamento(){
        this.qualidade += new Random().nextInt(3)+1;
    }


    @Override
    public String toString() {
        return nome + " (" + apelido + ") " + dataNascimento + " CONDIÇÃO: " + (verificaCondicaoJogador() ? "NÃO PODE JOGAR": "PODE JOGAR");
    }
}

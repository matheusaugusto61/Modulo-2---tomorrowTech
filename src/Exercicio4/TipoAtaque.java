package Exercicio4;

public enum TipoAtaque {

    PERFURANTE("É um ataque perfurante"),
    FOGO("É um ataque fogo!"),
    VENENO("É um ataque venenoso"),
    SANGRENTO("É um ataque venenoso"),
    PANCADA("É um ataque pancada");

    private String descricao;

    TipoAtaque(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

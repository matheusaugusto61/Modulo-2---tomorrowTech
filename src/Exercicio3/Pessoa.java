package Exercicio3;

import java.util.Objects;

public abstract class Pessoa {

    protected  String cpf;
    protected  String nome;
    protected  int rg;

    public Pessoa(String cpf, String nome, int rg) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return rg == pessoa.rg && Objects.equals(cpf, pessoa.cpf) && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, rg);
    }
}

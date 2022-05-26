package Exercicio3;

import java.util.ArrayList;

public class Aluno extends Pessoa{

    private int idade;
    private String turma;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String cpf, String nome, int rg, int idade, String turma, ArrayList<Disciplina> disciplinas) {
        super(cpf, nome, rg);
        this.idade = idade;
        this.turma = turma;
        this.disciplinas = disciplinas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double calculoMediaNotas(){
        return  disciplinas.stream()
                .mapToDouble(Disciplina::getNota)
                .average()
                .orElse(0.0);
    }
}

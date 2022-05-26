package Exercicio3;

import java.util.ArrayList;

public class Professor extends Funcionario{

    protected ArrayList<String> Disciplinas = new ArrayList<>();
    protected ArrayList<String> Turmas = new ArrayList<>();

    public Professor(String cpf, String nome, int rg, String cargo, Double salario, ArrayList<String> disciplinas, ArrayList<String> turmas) {
        super(cpf, nome, rg, cargo, salario);
        Disciplinas = disciplinas;
        Turmas = turmas;
    }

    public ArrayList<String> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        Disciplinas = disciplinas;
    }

    public ArrayList<String> getTurmas() {
        return Turmas;
    }

    public void setTurmas(ArrayList<String> turmas) {
        Turmas = turmas;
    }
}

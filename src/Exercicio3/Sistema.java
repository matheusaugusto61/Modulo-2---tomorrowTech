package Exercicio3;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Aluno> alunos;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Professor> professores;

    public Sistema(ArrayList<Aluno> alunos, ArrayList<Funcionario> funcionarios, ArrayList<Professor> professores) {
        this.alunos = alunos;
        this.funcionarios = funcionarios;
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }


    public ArrayList<Professor> getProfessores() {
        return professores;
    }


    public void adicionaPessoa(Pessoa pessoa){
        if(pessoa instanceof Professor){
            Professor professor = (Professor) pessoa;
            this.professores.add(professor);
        }else if(pessoa instanceof Funcionario){
            Funcionario funcionario = (Funcionario) pessoa;
            this.funcionarios.add(funcionario);
        }else if(pessoa instanceof Aluno){
            Aluno aluno = (Aluno) pessoa;
            this.alunos.add(aluno);
        }
    }

    public int verificaPessoa(Pessoa pessoa){
        if(pessoa instanceof Professor){
            Professor professor = (Professor) pessoa;
            return this.professores.indexOf(professor);
        }else if(pessoa instanceof Funcionario){
            Funcionario funcionario = (Funcionario) pessoa;
            return this.funcionarios.indexOf(funcionario);
        }else if(pessoa instanceof Aluno){
            Aluno aluno = (Aluno) pessoa;
            return this.alunos.indexOf(aluno);
        }
        return -1;
    }

    public void modificaPessoa(Pessoa pessoa){
        if(verificaPessoa(pessoa)!=-1) {
            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                this.professores.set(this.professores.indexOf(professor), professor);
            } else if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                this.funcionarios.set(this.funcionarios.indexOf(funcionario), funcionario);
            } else if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                this.alunos.set(this.alunos.indexOf(aluno), aluno);
            }
        }
    }

    public void deletaPessoa(Pessoa pessoa){
        int posicao = verificaPessoa(pessoa);
        if(posicao!=-1) {
            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                this.professores.remove(posicao);
            } else if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                this.funcionarios.remove(posicao);
            } else if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                this.alunos.remove(posicao);
            }
        }else{
            System.out.println("Pessoa não encontrada");
        }
    }

    public void mostraAluno(){
        this.alunos.forEach(System.out::println);
    }

    public void mostraFuncionario(){
        this.funcionarios.forEach(System.out::println);
    }

    public void mostraProfessor(){
        this.professores.forEach(System.out::println);
    }




}

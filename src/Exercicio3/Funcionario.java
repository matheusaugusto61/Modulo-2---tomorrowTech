package Exercicio3;

public class Funcionario extends Pessoa{

    protected  String cargo;
    protected  Double salario;

    public Funcionario(String cpf, String nome, int rg, String cargo, Double salario) {
        super(cpf, nome, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

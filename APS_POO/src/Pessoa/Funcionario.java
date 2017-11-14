package Pessoa;

public class Funcionario {

    private String cpf;
    private String nome;
    private String telefone;
    private double salario;

    public Funcionario(String nome, String cpf, String telefone, double salario) {
        cpf = this.cpf;
        nome = this.nome;
        telefone = this.telefone;
        salario = this.salario;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

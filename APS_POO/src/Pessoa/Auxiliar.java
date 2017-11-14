package Pessoa;

public class Auxiliar extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public Auxiliar(String cpf, String nome, String telefone, double salario, double valorHora, double horasTrabalhadas) {
        super(cpf, nome, telefone, salario);
        valorHora = this.valorHora;
        horasTrabalhadas = this.horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}

package Pessoa;


public class Motorista extends Funcionario {

    private String CNH;
    private double valorDiaria;
    private int diarias;

    public Motorista(String cpf, String nome, String telefone, String CNH, double valorDiaria, double salario, int diarias) {
        super(cpf, nome, telefone, salario);
        CNH = this.CNH;
        valorDiaria = this.valorDiaria;
        diarias = this.diarias;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }
}

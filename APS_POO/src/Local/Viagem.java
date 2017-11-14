package Local;

import java.util.Date;

public class Viagem {

    private Date saida;
    private Date chegada;
    private double peso;
    private double volume;

    public Viagem(Date saida, Date chegada, double peso, double volume) {
        this.saida = saida;
        this.chegada = chegada;
        this.peso = peso;
        this.volume = volume;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}

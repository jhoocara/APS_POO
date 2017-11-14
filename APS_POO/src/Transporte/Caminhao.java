package Transporte;

public class Caminhao extends Veiculo {

    private int capPeso;
    private int capCarga;

    public Caminhao(int capPeso, int capCarga, String placa) {
        super(placa);
        this.capPeso = capPeso;
        this.capCarga = capCarga;
    }

    public int getCapPeso() {
        return capPeso;
    }

    public void setCapPeso(int capPeso) {
        this.capPeso = capPeso;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

}

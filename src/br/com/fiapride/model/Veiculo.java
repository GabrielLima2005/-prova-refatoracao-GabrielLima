package br.com.fiapride.model;


public class Veiculo {

    private String proprietario;
    private String placa;
    private double gasolina;

    public Veiculo(String proprietario, String placa) {
        if (proprietario == null || proprietario.isBlank()) {
            throw new IllegalArgumentException("O proprietario do veiculo e obrigatorio.");
        }
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa do veiculo e obrigatoria.");
        }
        this.proprietario = proprietario;
        this.placa = placa;
        this.gasolina = 0.0; 
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void adicionarGasolina(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("A quantidade adicionada deve ser maior que zero.");
        }
        this.gasolina += litros;
    }

    public void gastarGasolina(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("A quantidade consumida deve ser maior que zero.");
        }
        if (litros > this.gasolina) {
            throw new IllegalArgumentException(
                "Consumo de " + litros + "L maior que a gasolina disponivel (" + this.gasolina + "L)."
            );
        }
        this.gasolina -= litros;
    }

    @Override
    public String toString() {
        return "Dono: " + proprietario + " | Placa: " + placa + " | Gasolina: " + gasolina;
    }
}

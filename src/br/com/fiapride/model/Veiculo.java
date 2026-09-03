package br.com.fiapride.model;

/**
 * Representa um veiculo da frota do FiapRide.
 *
 * Esta classe foi refatorada a partir do codigo legado "veiculos":
 * - Atributos passaram de public para private (encapsulamento real).
 * - Nomes de atributos e metodos foram trocados por nomes claros (Clean Code).
 * - Adicionadas validacoes para impedir estados invalidos (gasolina negativa,
 *   consumo maior que o disponivel no tanque).
 */
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
        this.gasolina = 0.0; // todo veiculo comeca com o tanque vazio, nunca negativo
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

    /**
     * Adiciona combustivel ao tanque do veiculo.
     * Substitui o antigo "adicionar(int v)".
     */
    public void adicionarGasolina(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("A quantidade adicionada deve ser maior que zero.");
        }
        this.gasolina += litros;
    }

    /**
     * Consome combustivel do tanque do veiculo.
     * Substitui o antigo "gasta(double v)".
     * Impede que o consumo deixe a gasolina negativa.
     */
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

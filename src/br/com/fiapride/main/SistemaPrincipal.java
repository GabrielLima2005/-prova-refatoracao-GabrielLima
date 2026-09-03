package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

    
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");

        v1.adicionarGasolina(50);

        try {
    
            v1.gastarGasolina(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Operacao bloqueada: " + e.getMessage());
        }

        v1.gastarGasolina(30);

        System.out.println(v1);
    }
}

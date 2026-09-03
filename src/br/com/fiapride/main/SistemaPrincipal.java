package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Antes: "veiculos v1 = new veiculos();" seguido de atribuicoes diretas
        // aos atributos publicos (sem nenhuma validacao).
        // Agora: os dados obrigatorios entram pelo construtor, e o estado
        // interno so pode ser alterado atraves de metodos que validam a regra.
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");

        v1.adicionarGasolina(50);

        try {
            // Antes isso silenciosamente deixava a gasolina negativa.
            // Agora a classe protege seu proprio estado e lanca um erro claro.
            v1.gastarGasolina(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Operacao bloqueada: " + e.getMessage());
        }

        v1.gastarGasolina(30);

        System.out.println(v1);
    }
}

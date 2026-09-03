package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.setIndividuo("Pedro Paulo");
        v1.setPl("033-Jesus");

        // Teste de valor inválido de gasolina
        v1.setGas(-10);

        // Teste de valor válido de gasolina
        v1.adicionar(50);

        // Teste de consumo inválido de gasolina
        v1.gasta(100);
        
        // Teste de consumo válido de gasolina
        v1.gasta(20);

        System.out.println("Dono: " + v1.getIndividuo());
        System.out.println("Placa: " + v1.getPl());
        System.out.println("Gasolina: " + v1.getGas());
    }

}
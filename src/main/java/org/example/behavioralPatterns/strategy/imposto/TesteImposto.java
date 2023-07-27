package org.example.behavioralPatterns.strategy.imposto;

public class TesteImposto {

    public static void main(String[] args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(50);

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.realizaCalculo( orcamento ,icms);
        calculadorDeImposto.realizaCalculo( orcamento ,iss);

        orcamento = new Orcamento(900);
        calculadorDeImposto.realizaCalculo( orcamento ,iccc);

        orcamento = new Orcamento(1500);
        calculadorDeImposto.realizaCalculo( orcamento ,iccc);

        orcamento = new Orcamento(3500);
        calculadorDeImposto.realizaCalculo( orcamento ,iccc);
    }

}

package org.example.behavioralPatterns.chainOfResponsibility.vendasOrcamento;

public class TestaDescontos {
    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(499.0);
        orcamento.adicionaItem(new Item(EnumItens.CANETA, 249.0));
        orcamento.adicionaItem(new Item(EnumItens.LAPIS, 250.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);

    }
}
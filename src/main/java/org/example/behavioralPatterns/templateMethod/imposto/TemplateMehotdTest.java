package org.example.behavioralPatterns.templateMethod.imposto;


import org.example.behavioralPatterns.chainOfResponsibility.vendasOrcamento.EnumItens;

public class TemplateMehotdTest {

    public static void main(String[] args) {

        Imposto impostoX = new ImpostoX();
        Imposto impostoY = new ImpostoY();
        Imposto impostoZ = new ImpostoZ();

        Orcamento orcamento = new Orcamento(1000);

        System.out.println(impostoX.calculaImposto(orcamento));
        System.out.println(impostoY.calculaImposto(orcamento));

        orcamento = new Orcamento(1000);
        orcamento.adicionaItem(new Item(EnumItens.CANETA,101));


        System.out.println(impostoX.calculaImposto(orcamento));
        System.out.println(impostoY.calculaImposto(orcamento));

        orcamento.adicionaItem(new Item(EnumItens.CANETA,105));
        System.out.println(impostoZ.calculaImposto(orcamento));

    }


}

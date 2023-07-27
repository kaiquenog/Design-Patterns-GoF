package org.example.behavioralPatterns.templateMethod.imposto;

public class ImpostoY extends TemplateDeImpostoCondicional {

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for( Item itens:orcamento.getItens()){
            if (itens.getValor() > 100){
                return  true;
            }
        }
        return false;
    }

    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
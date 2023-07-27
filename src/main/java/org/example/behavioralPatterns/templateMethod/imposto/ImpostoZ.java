package org.example.behavioralPatterns.templateMethod.imposto;

import chainOfResponsibility.vendasOrcamento.EnumItens;

import java.util.ArrayList;
import java.util.List;

public class ImpostoZ  extends TemplateDeImpostoCondicional {

    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<EnumItens> noOrcamento = new ArrayList<EnumItens>();

        for(Item item : orcamento.getItens()) {
            if(noOrcamento.contains(item.getNome())) return true;
            else noOrcamento.add(item.getNome());
        }

        return false;
    }

    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }
}
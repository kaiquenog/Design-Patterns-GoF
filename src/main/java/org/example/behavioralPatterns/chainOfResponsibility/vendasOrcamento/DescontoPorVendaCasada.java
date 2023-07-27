package org.example.behavioralPatterns.chainOfResponsibility.vendasOrcamento;


import java.util.List;

public class DescontoPorVendaCasada implements Desconto {


    private Desconto proximo;

    public double desconta(Orcamento orcamento) {

        if(existeVendaCasada(orcamento)) {
            return orcamento.getValor() * 0.05;
        }
        return  proximo.desconta(orcamento);
    }

    private boolean existeVendaCasada(Orcamento orcamento) {
        return contemItemDeNome(EnumItens.LAPIS, orcamento.getItens()) &&
                contemItemDeNome(EnumItens.CANETA, orcamento.getItens());
    }

    public boolean contemItemDeNome(EnumItens nomeDoItem, List<Item> itens) {

        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}

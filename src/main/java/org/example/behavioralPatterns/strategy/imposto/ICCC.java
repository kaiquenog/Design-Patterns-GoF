package org.example.behavioralPatterns.strategy.imposto;

public class ICCC  implements Imposto{

    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor() < 1000 ? orcamento.getValor() * 0.05 :
               orcamento.getValor() <= 3000 ? orcamento.getValor() * 0.07 :
               orcamento.getValor() > 3000 ? (orcamento.getValor() * 0.08) + 30 : 0;
    }
}

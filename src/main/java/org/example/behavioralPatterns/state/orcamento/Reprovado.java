package org.example.behavioralPatterns.state.orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
    }


    public void aprova(Orcamento orcamento) {

        throw new RuntimeException("Orçamentos reprovados não podem ser aprovados!");
    }


    public void reprova(Orcamento orcamento) {

        throw new RuntimeException("Orçamento já está reprovado!");
    }


    public void finaliza(Orcamento orcamento) {

        orcamento.estadoAtual = new Finalizado();
    }
}

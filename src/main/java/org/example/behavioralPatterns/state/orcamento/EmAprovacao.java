package state.orcamento;

public class EmAprovacao  implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.05;
            descontoAplicado = true;
        }else
        {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }


    public void aprova(Orcamento orcamento) {

        orcamento.estadoAtual = new Aprovado();
    }


    public void reprova(Orcamento orcamento) {

        orcamento.estadoAtual = new Reprovado();
    }


    public void finaliza(Orcamento orcamento) {

        throw new RuntimeException("Orçamentos em aprovação não podem ir direto para finalizado!");
    }
}
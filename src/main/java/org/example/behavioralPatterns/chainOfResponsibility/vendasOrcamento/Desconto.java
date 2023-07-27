package chainOfResponsibility.vendasOrcamento;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
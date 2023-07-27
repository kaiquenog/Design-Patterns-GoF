package chainOfResponsibility.vendasOrcamento;

public class Item {

    private EnumItens nome;
    private double valor;

    public Item(EnumItens nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public EnumItens getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

}
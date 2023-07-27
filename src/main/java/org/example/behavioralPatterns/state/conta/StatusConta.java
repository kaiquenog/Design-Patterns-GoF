package state.conta;

public interface StatusConta {

    void depositar(Conta conta, double valor);
    void sacar(Conta conta, double valor);
}

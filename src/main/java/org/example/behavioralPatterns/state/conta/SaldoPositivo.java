package state.conta;

public class SaldoPositivo implements  StatusConta {


    public void sacar(Conta conta, double valor) {

        conta.saldo -= valor;
        if (conta.saldo < 0) conta.statusConta = new SaldoNegativo();

    }
    public void depositar(Conta conta, double valor) {

        conta.saldo += valor * 0.98;
    }
}

package state.conta;

public class SaldoNegativo implements  StatusConta {



    public void sacar(Conta conta, double valor) {
        throw new RuntimeException("Sua conta está negativa, saldo atual:"+ conta.saldo);
    }

    public void depositar(Conta conta, double valor) {

       conta.saldo += valor*0.95;
       if(conta.saldo>0) conta.statusConta = new SaldoPositivo();

    }
}

package state.conta;

class Conta {


    protected double saldo;
    protected StatusConta statusConta;

    public Conta() {
        statusConta = new SaldoPositivo();
    }

    public void deposita(double valor) {
        statusConta.depositar(this, valor);
    }

    public void saque(double valor) throws Exception {
        statusConta.sacar(this, valor);
    }

    public double getSaldo() {
        return saldo;
    }

}
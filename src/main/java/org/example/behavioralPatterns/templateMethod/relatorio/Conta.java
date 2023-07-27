package org.example.behavioralPatterns.templateMethod.relatorio;

public class Conta {

    String nome;
    double saldo;
    int    agencia;
    int    numConta;

    public Conta(String titular, double saldo, int agencia, int numConta) {
        this.nome = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }
}

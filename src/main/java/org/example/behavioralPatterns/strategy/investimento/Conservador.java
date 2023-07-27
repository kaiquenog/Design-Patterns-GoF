package org.example.behavioralPatterns.strategy.investimento;

public class Conservador implements Investimento{
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}
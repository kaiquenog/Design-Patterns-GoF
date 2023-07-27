package org.example.behavioralPatterns.observer;

public class Multiplicador implements AcaoAposGerarNota {
    private double fator;

    public Multiplicador(double fator) {
        this.fator = fator;
    }

    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Valor da nota pelo fator "+ notaFiscal.getValorBruto() * this.fator);
    }
}
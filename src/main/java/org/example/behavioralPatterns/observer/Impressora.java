package org.example.behavioralPatterns.observer;

public class Impressora implements AcaoAposGerarNota {
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("imprimindo notaFiscal");
    }
}
package org.example.behavioralPatterns.observer;

public class EnviadorDeSms implements AcaoAposGerarNota {
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviando por sms");
    }
}
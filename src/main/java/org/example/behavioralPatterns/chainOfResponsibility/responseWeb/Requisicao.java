package org.example.behavioralPatterns.chainOfResponsibility.responseWeb;

public class Requisicao {
    private Formato formato;
    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }


}
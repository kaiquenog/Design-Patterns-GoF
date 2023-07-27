package org.example.behavioralPatterns.chainOfResponsibility.responseWeb;

public interface Resposta {
    void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);
}

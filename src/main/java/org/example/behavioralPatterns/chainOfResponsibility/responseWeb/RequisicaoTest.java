package org.example.behavioralPatterns.chainOfResponsibility.responseWeb;

public class RequisicaoTest {

    public static void main(String[] args) {

        Conta conta = new Conta("Jose",1000.0);
        Requisicao rCsv = new Requisicao(Formato.CSV);

        FormataRetorno retorno = new FormataRetorno();
        retorno.setRetorno(conta, rCsv);

        Requisicao rXml = new Requisicao(Formato.XML);
        retorno.setRetorno(conta, rXml);

        Requisicao rPrc = new Requisicao(Formato.PORCENTO);
        retorno.setRetorno(conta, rPrc);


    }
}

package org.example.behavioralPatterns.chainOfResponsibility.responseWeb;

public class FormataRetorno {



   void setRetorno(Conta conta, Requisicao requisicao){


       Resposta r1 =  new RespostaEmCsv();
       Resposta r2 =  new RespostaEmPorcento();
       Resposta r3 =  new RespostaEmXml();



       r1.setProxima(r2);
       r2.setProxima(r3);
       r1.responde(requisicao, conta);
   }
}

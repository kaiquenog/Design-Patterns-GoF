package org.example.behavioralPatterns.state.conta;

public class testStatusConta {


    public static void main(String[] args) throws Exception {

        Conta conta = new Conta();

        conta.deposita(100);
        System.out.println("saldo:"+conta.getSaldo());
        System.out.println(conta.statusConta);

        conta.saque(150);
        System.out.println("saldo:"+conta.getSaldo());
        System.out.println(conta.statusConta);

        conta.deposita(60);
        System.out.println("saldo:"+conta.getSaldo());
        System.out.println(conta.statusConta);

        conta.saque(80);
        System.out.println("saldo:"+conta.getSaldo());
        System.out.println(conta.statusConta);

        conta.saque(10);
        System.out.println("saldo:"+conta.getSaldo());
        System.out.println(conta.statusConta);



    }

}

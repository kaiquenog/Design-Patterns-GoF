package org.example.abstractFactory.client;

import org.example.abstractFactory.authetication.MethodAuthentic;
import org.example.abstractFactory.authetication.MethodAuthenticFactory;

public class AuthClient {

    private MethodAuthenticFactory factory;

    public AuthClient(MethodAuthenticFactory factory){
        this.factory = factory;
    }

    public  void performAuthentication(String typeOfAuthentic){
        MethodAuthentic methodAuthentic = factory.createMethodAuthentic(typeOfAuthentic);
        System.out.println("Method authentication "+ methodAuthentic.getTypeAuthentic());
    }
}

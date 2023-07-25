package org.example;

import org.example.abstractFactory.authetication.AuthenticFactory;
import org.example.abstractFactory.authetication.MethodAuthenticFactory;
import org.example.abstractFactory.client.AuthClient;

public class Main {

    public static void main(String[] args) {

        //Abstract Factory
        AuthClient auth = new AuthClient(new AuthenticFactory());
        auth.performAuthentication("Biometric");

        AuthClient authP = new AuthClient(new AuthenticFactory());
        authP.performAuthentication("Password");


    }


}
package org.example.abstractFactory.authetication;

public class AuthenticFactory implements MethodAuthenticFactory {

    @Override
    public MethodAuthentic createMethodAuthentic(String typeOfAuthentication) {
        if("Biometric".equalsIgnoreCase(typeOfAuthentication)) {
            return  new Biometric();
        }
        else if ("Password".equalsIgnoreCase(typeOfAuthentication)) {
            return  new Password();
        }
        return null;
    }
}

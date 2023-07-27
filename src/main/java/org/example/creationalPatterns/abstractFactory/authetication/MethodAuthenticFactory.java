package org.example.creationalPatterns.abstractFactory.authetication;

public interface MethodAuthenticFactory<T> {
    MethodAuthentic createMethodAuthentic(String typeOfAuthentication);
}

package org.example.abstractFactory.authetication;

public interface MethodAuthenticFactory<T> {
    MethodAuthentic createMethodAuthentic(String typeOfAuthentication);
}

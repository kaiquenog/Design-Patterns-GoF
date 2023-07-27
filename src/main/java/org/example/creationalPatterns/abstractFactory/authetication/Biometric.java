package org.example.creationalPatterns.abstractFactory.authetication;

public class Biometric implements  MethodAuthentic{

    private String authenticProperties;

    Biometric(){
        this.authenticProperties = "Biometric";
    }

    @Override
    public String getTypeAuthentic() {
        return this.authenticProperties;
    }
}

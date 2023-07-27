package org.example.creationalPatterns.abstractFactory.authetication;

public class Password implements  MethodAuthentic{

    String authenticProperties;
    Password(){
        this.authenticProperties = "Password";
    }
    @Override
    public String getTypeAuthentic() {
        return this.authenticProperties;
    }
}

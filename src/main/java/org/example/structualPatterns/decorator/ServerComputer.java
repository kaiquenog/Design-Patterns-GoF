package org.example.structualPatterns.decorator;

public class ServerComputer extends   ComputerDecorator{


    public ServerComputer(Computer c) {
        super(c);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Add feature server to computer");
    }
}

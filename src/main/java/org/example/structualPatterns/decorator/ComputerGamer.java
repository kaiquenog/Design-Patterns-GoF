package org.example.structualPatterns.decorator;

public class ComputerGamer extends  ComputerDecorator{


    public ComputerGamer(Computer c) {
        super(c);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Add feature gamer to computer");
    }
}

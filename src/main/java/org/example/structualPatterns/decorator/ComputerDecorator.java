package org.example.structualPatterns.decorator;

import java.util.concurrent.CountedCompleter;

public class ComputerDecorator implements Computer{

    protected Computer computer;

    ComputerDecorator(Computer c){
        this.computer = c;
    }

    @Override
    public void build() {
        this.computer.build();
    }
}

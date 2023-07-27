package org.example.structualPatterns.decorator;

public class BasicComputer implements  Computer{
    @Override
    public void build() {
        System.out.println("Basic Computer");
    }
}

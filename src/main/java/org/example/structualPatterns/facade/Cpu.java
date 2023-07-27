package org.example.structualPatterns.facade;

public class Cpu {

    public void start(){
        System.out.println("Start");
    }

    public  void  execute(){
        System.out.println("Execute");
    }

    public void load(){
        System.out.println("Load");
    }

    public void free(){
        System.out.println("Free resource");
    }




}


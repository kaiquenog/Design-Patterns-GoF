package org.example;

import org.example.behavioralPatterns.command.Maquina;
import org.example.behavioralPatterns.command.MaquinaOnCommand;
import org.example.behavioralPatterns.iterator.Iterator;
import org.example.behavioralPatterns.iterator.ListPurchase;
import org.example.creationalPatterns.abstractFactory.authetication.AuthenticFactory;
import org.example.creationalPatterns.abstractFactory.client.AuthClient;
import org.example.structualPatterns.adapter.AdpterPrint;
import org.example.structualPatterns.adapter.Print3D;
import org.example.structualPatterns.composite.Circle;
import org.example.structualPatterns.composite.Drawing;
import org.example.structualPatterns.composite.Shape;
import org.example.structualPatterns.composite.Triangle;
import org.example.structualPatterns.decorator.*;
import org.example.structualPatterns.facade.ComputerFacade;
import org.example.structualPatterns.facade.Cpu;
import org.example.structualPatterns.facade.HardDisk;
import org.example.structualPatterns.facade.Memory;

public class Main {

    public static void main(String[] args) {

        // Creational
        System.out.println("-------------- Behavioral -----------");
        System.out.println("-------------- Abstract Factory -----------");
        abstractFactory();

        //Behavioral
        System.out.println("-------------- Behavioral -----------");
        System.out.println("-------------- Command -----------");
        command();
        System.out.println("-------------- Iterator -----------");
        iterator_();

        // Structural
        System.out.println("-------------- Structural -----------");
        System.out.println("-------------- Adapter -----------");
        adapter();
        System.out.println("-------------- Composite -----------");
        composite();
        System.out.println("-------------- Decorator -----------");
        decorator();
        System.out.println("-------------- Facade -----------");
        facade();


    }

    private static void iterator_() {
        ListPurchase listPurchase = new ListPurchase();

        for(Iterator iterator = listPurchase.getIterator(); iterator.hasNext();){
            System.out.println( iterator.next() );
        }
    }

    private static void command() {
        Maquina maquina = new Maquina();
        MaquinaOnCommand m = new MaquinaOnCommand(maquina);
        m.execute();
    }

    static void abstractFactory(){
        AuthClient auth = new AuthClient(new AuthenticFactory());
        auth.performAuthentication("Biometric");
        auth.performAuthentication("Password");
    }
    static void adapter(){
        Print3D print3D = new Print3D();
        AdpterPrint adp = new AdpterPrint(print3D);
        adp.print();
    }

    static void decorator(){
        Computer gamerComputer = new ComputerGamer(new BasicComputer());
        gamerComputer.build();

        Computer serverComputer = new ServerComputer(gamerComputer);
        serverComputer.build();
    }

    static void composite(){
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");
    }

    static  void facade(){
        Cpu cpu = new Cpu();
        Memory memory = new Memory();
        HardDisk hardDisk = new HardDisk();

        ComputerFacade facade = new ComputerFacade(cpu, memory, hardDisk);
        facade.ligarComputador();
    }


}
package org.example.structualPatterns.facade;

public class HardDisk {

    public String read(int startPosition, int size) {
        System.out.println("lê dados do HD");
        return "dados HD";
    }
    public void write(int position, String info) {
        System.out.println("escreve dados no HD");
    }
}

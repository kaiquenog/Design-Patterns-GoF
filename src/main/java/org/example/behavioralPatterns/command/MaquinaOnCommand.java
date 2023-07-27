package org.example.behavioralPatterns.command;

public class MaquinaOnCommand implements Command{

    Maquina maquina;

    public MaquinaOnCommand(Maquina maquina){
        this.maquina = maquina;
    }

    @Override
    public void execute() {
        maquina.on();
    }



}

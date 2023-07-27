package org.example.structualPatterns.adapter;

public class AdpterPrint extends Print {

    private Print3D print3D;

    public AdpterPrint(Print3D print3D){
        this.print3D = print3D;
    }

    public void  print(){
        print3D.print3D();
    }


}

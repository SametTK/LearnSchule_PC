package org.example;

public class Beamter extends Angestellter{


    protected Beamter(String name,  char gesch, String adresse,int alter){
        super(name,gesch,adresse,alter);

    }


    public double berechneGehalt(){
        return 1462;
    }


}

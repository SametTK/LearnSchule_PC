package org.example;

public abstract class Angestellter extends Mitarbeiter{


    protected Angestellter(String name, char gesch, String adresse,int alter) {
        super(name,gesch,adresse,alter);
    }




    public abstract double berechneGehalt();



}

package org.example;

public class Vertragsbediensteter extends Angestellter{


    public Vertragsbediensteter(String name, char gesch, String adresse,int alter) {
        super(name,gesch,adresse,alter);

    }

    @Override
    public double berechneGehalt() {
        return 1500;
    }


}


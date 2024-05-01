package org.example;

import javax.naming.Name;

public class Manager extends Mitarbeiter{

    private float fixum;
    public Manager(String name, char gesch, String adresse,int alter, float fixum) {
        super(name,gesch,adresse,alter);
        setFixum(fixum);


    }

    //Setter
    public void setFixum(float fixum) {
       if (fixum > 0){
           this.fixum = fixum;
       }else {
           System.out.println("fixum kann nicht unter 0 sein");
       }
    }

    //Getter
    public float getFixum() {
        return fixum;
    }



    //------------Methode---------------//
    public double berechneGehalt(){
        return fixum;
    }
}

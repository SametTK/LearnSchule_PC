package org.example;

public class Freelancer extends Mitarbeiter{

    private float stundenSatz;
    private int stunden;

    public Freelancer(String name, char gesch, String adresse,int alter, float stundenSatz, int stunden) {
        super(name,gesch,adresse,alter);
        setStundenSatz(stundenSatz);
        setStunden(stunden);
    }

    @Override
    public double berechneGehalt() {
        return stunden*stundenSatz;
    }



    //---------------Getter------------//


    public float getStundenSatz() {
        return stundenSatz;
    }

    public int getStunden() {
        return stunden;
    }

    //-------------Setter--------------//


    public void setStundenSatz(float stundenSatz) {
        if (stundenSatz > 0){
            this.stundenSatz = stundenSatz;
        }else {
            System.out.println("StundenSatz kann nicht negativ sein");
        }

    }

    public void setStunden(int stunden) {
        if (stunden > 0){
            this.stunden = stunden;
        }else {
            System.out.println("Stundne können nicht negativ sein");
        }
    }
}

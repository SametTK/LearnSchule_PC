package org.example;

import java.util.Objects;

public class Mitarbeiter implements Comparable<Mitarbeiter> {


    private static int idCounter;
    private int id;
    private String name;
    private char gesch;
    private String adresse;
    private int alter;


    public Mitarbeiter(String name) {
        setName(name);
        id++;
    }

    public static void main(String[] args) {
        Mitarbeiter m = new Mitarbeiter("Mitarbeiter");
        Mitarbeiter s = new Mitarbeiter("Mitarbeiter");


        System.out.println(m.getId() + " " + s.getId());
    }


    //setter
    public void setIdCounter(int idCounter) {
        if (idCounter == this.id) {
            id++;
        }
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("setId: Id is zero");
        }
    }

    public void setGesch(char gesch) {
        if (gesch == 'M' || gesch == 'W') {
            this.gesch = gesch;
        } else {
            System.out.println("setGesch: Gesch bitte groß schreiben entweder M oder W");
        }
    }

    public void setAdresse(String adresse) {
        if (adresse != null) {
            this.adresse = adresse;
        } else {
            System.out.println("setAdresse: Adresse is null");
        }
    }

    public void setAlter(int alter) {
        if (alter > 0) {
            this.alter = alter;
        } else {
            System.out.println("setAlter: Alter is zero");
        }

    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Mitarbeiter name is null");
        }
    }


    //Getter

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public char getGesch() {
        return gesch;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }

    // Methoden

    public double berechneGehalt() {

        return 0;
    }


    @Override
    public int compareTo(Mitarbeiter mitarbeiter) {
        return this.name.compareTo(mitarbeiter.getName());

    }

//    @Override
//    public boolean equals(Object object) {
//        if (this == object) {
//            return true;
//        }
//        if (object == null) {
//            return false;
//        }
//        return this.id == ((Mitarbeiter) object).getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Mitarbeiter that = (Mitarbeiter) object;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mitarbeiter { ");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gesch=").append(gesch);
        sb.append(", adresse=").append(adresse);
        sb.append(", alter=").append(alter);
        sb.append("}");
        return sb.toString();
    }

}

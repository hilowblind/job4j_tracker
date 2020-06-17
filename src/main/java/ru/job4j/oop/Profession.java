package ru.job4j.oop;

public class Profession {
    private String name;
    private String surName;
    private int birthdayYear;
    private String education;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public String getEducation() {
        return education;
    }
}

class Doctor extends Profession {
    public void putOnaMedicalGown() {

    }
    public void examineAPatient(Patient patient) {

    }
}

class Engineer extends Profession {
    public void createProject() {

    }
}

class Surgeon extends Doctor {
    private int amountOfOperations;
    public int getAmountOfOperations() {
        return amountOfOperations;
    }
    public void takeScalpel(Scalpel scalpel) {

    }
}

class Dentist extends Doctor {
    private int teethRemoved;
    public int getTeethRemoved() {
        return teethRemoved;
    }
    public void turnOnDrill() {

    }
}

class Programmer extends Engineer {
    private long amountStringsOfCod;
    public long getAmountStringsOfCod() {
        return getAmountStringsOfCod();
    }
    public void toProgram() {

    }
}

class Builder extends Engineer {
    private byte amountOfBuildings;
    public byte getAmountOfBuildings() {
        return amountOfBuildings;
    }
    public void toBuild() {

    }
}

class Patient{}
class Scalpel{}
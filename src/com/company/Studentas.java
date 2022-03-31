package com.company;

public class Studentas {
    private final String vardas;
    private final String pavarde;
    private final String universitetas;

    public Studentas(String vardas, String pavarde, String universitetas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.universitetas = universitetas;
    }

    @Override
    public String toString() {
        return "****************Studentas******************\n" +
                "vardas: " + vardas + ",\n" +
                "pavarde: " + pavarde + ",\n" +
                "universitetas: " + universitetas + ".\n-------------------------------\n";
    }
}

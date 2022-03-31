package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Studentas> studentai = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("4")) {
            printMenu();
            input = sc.next();
            switch (input) {
                case "1":

                    System.out.print("iveskite studento varda: ");
                    String vardas = sc.next();
                    System.out.print("iveskite studento pavarde: ");
                    String pavarde = sc.next();
                    System.out.print("iveskite studento numeri: ");
                    int nr = sc.nextInt();
                    if (studentai.containsKey(nr)){
                        System.out.print("Sis numeris uzimtas, iveskite kita: ");
                        nr = sc.nextInt();
                    }
                    System.out.print("iveskite studento universiteta: ");
                    String universitetas = sc.next();
                    System.out.println();
                    studentai.put(nr, new Studentas(vardas, pavarde, universitetas));
                    break;
                case "2":

                    System.out.print("Surasti studenta pagal numeri: ");
                            int tikrinti = sc.nextInt();
                    if (studentai.containsKey(tikrinti)) {
                        System.out.println(studentai.get(tikrinti));
                    } else {
                        System.out.println("Studentas nerastas");
                    }
                    break;
                case "3":
                    System.out.println(studentai);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Neatpazinta ivestis");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("[1] Ivesti studenta");
        System.out.println("[2] Gauti studenta pagal numeri");
        System.out.println("[3] Studentu sarasas");
        System.out.println("[4] EXIT");
    }
}

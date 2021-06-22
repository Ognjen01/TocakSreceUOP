package com.ognjenlazic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> listaPitanja = new ArrayList<>();
        listaPitanja = procitajFajl("pitanja.txt");

        for (String pitanje: listaPitanja
        ) {
            System.out.println(pitanje);
        }

        TocakSrece tocakSrece = new TocakSrece(listaPitanja);
        tocakSrece.setVisible(true);
    }






    public static List<String> procitajFajl(String nazivFajla) {
        List<String> podijeljeniRedovi = new ArrayList<String>();

        try {
            File fajl = new File("src/pitanja/" + nazivFajla);
            BufferedReader reader = new BufferedReader(new FileReader(fajl));
            String red;
            while ((red = reader.readLine()) != null) {

                podijeljeniRedovi.add(red);
            }

        } catch (Exception e) {
            System.out.println("Došlo je do greke " + e);
            return null;
        }

        return podijeljeniRedovi;
    }
}


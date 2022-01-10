package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Repo {
    private List<Offerten> OffertenList = new ArrayList<>();

    public Repo(String fileName) throws IOException {
        readFromFile(fileName);
    }

    private void readFromFile(String fileName) throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        String[] lines = data.split("\n");
        for(String line : lines) {
            line = line.replace("\n", "");
            line = line.replace("\r", "");
            String[] attributen = line.split("&");
            String Id = attributen[0];
            String Unternehmensname = attributen[1];
            String Preis = attributen[2];
            String Mehrwertsteuer = attributen[3];
            String Adresse = attributen[4];
            String Ort = attributen[5];
            Offerten offerten = new Offerten(Integer.parseInt(Id), Unternehmensname, Float.parseFloat(Preis), Integer.parseInt(Mehrwertsteuer), Adresse,Ort);
            OffertenList.add(offerten);
        }
    }


}
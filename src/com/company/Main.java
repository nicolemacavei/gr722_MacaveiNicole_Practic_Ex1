package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Repo repo = new Repo();
        //Service service = new Service();

        try {
            List<Offerten> listeOfferten = repo.readFromFile("C:\\Users\\macav\\Documents\\Facultate an II\\gr722_MacaveiNicole_Practic_Ex1\\offerten.txt", "&");

            System.out.println(service.sortListeTiereByName(listeOfferten));
            System.out.println(service.filterListeByDiaet(listeOfferten, Diaet.carnivore));

            repo.writeToFile("C:\\Users\\macav\\Documents\\Facultate an II\\gr722_MacaveiNicole_Practic_Ex1\\offertensortiert.txt", listeOfferten, "%");
            service.getMostFrequentPlace(listeTiere);
            System.out.println(service.getMostFrequentPlace(listeTiere));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

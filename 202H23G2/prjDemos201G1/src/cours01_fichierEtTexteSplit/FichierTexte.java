package cours01_fichierEtTexteSplit;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class FichierTexte {
    private ArrayList<String> listeExpressions;

    public FichierTexte() {
        listeExpressions = new ArrayList<>();
        lireFichier("expressionsIn.txt");
        afficher();
        trier();
        ecrireFichier("expressionsOut.txt");
    }

    private void trier() {
    }

    private void ecrireFichier(String nomFichier) {
    }

    private void lireFichier(String nomFichier) {
    }
    
    private void afficher() {
        for (String str: listeExpressions) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new FichierTexte();
    }
}

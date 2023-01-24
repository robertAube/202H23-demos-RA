package cours01_fichierEtTexteSplit;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class FichierTexte {
    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "src" + fSep + "fichiers" + fSep;

    private ArrayList<String> listeExpressions;

    public FichierTexte() {
        listeExpressions = new ArrayList<>();
        lireFichier("expressions.txt");
        afficher();
        trier();
        ecrireFichier("expressionsOut.txt");
    }

    private void trier() {
//        listeExpressions.sort(Comparator.naturalOrder());
        listeExpressions.sort(Comparator.reverseOrder());
    }

    private void ecrireFichier(String nomFichier) {
        try {
            PrintWriter sortie = new PrintWriter(new FileWriter(path + nomFichier));
            for (int i = 0; i < listeExpressions.size(); i++) {
                sortie.println(listeExpressions.get(i));
            }
            sortie.flush(); //force l'écriture du buffer (à faire au besoin)
            sortie.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void lireFichier(String nomFichier) {
        String ligne;
        try {
            BufferedReader entree = new BufferedReader(new FileReader(path + nomFichier)); //ouverture du fichier
            ligne = entree.readLine(); //lire une ligne
            while (ligne != null) {
                listeExpressions.add(ligne);
//                System.out.println(ligne);
                ligne = entree.readLine(); //lire une ligne
            }
            entree.close(); //fermeture de fichier
        } catch (IOException e) {
            System.out.println("Problème de lecture avec " + nomFichier);
        }
    }
    
    private void afficher() {
        for (int i = 0; i < listeExpressions.size(); i++) {
            System.out.println(listeExpressions.get(i));
        }
    }

    public static void main(String[] args) {
        new FichierTexte();
    }
}

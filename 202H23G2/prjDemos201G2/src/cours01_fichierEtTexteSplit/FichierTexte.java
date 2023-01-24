package cours01_fichierEtTexteSplit;

import java.io.*;
import java.util.ArrayList;

public class FichierTexte {
    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "src" + fSep + "fichiers" + fSep;

    private ArrayList<String> listeExpressions;

    public FichierTexte() {
        System.out.println(path);
        listeExpressions = new ArrayList<>();
        lireFichier(path + "expressions.txt");
        afficher();
        trier();
        ecrireFichier(path + "expressionsOut.txt");
    }

    private void trier() {
    }

    private void ecrireFichier(String nomFichier) {
        try {
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier)); //ouverture de fichier
            for (String str : listeExpressions) {
                sortie.println(str); //écriture
            }
            sortie.flush(); // vider les buffer et écrire dans le fichier immédatement (à faire au besoin)
            sortie.close(); //fermeture du fichier
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void lireFichier(String nomFichier) {
        String ligne;
        try {
            BufferedReader entree = new BufferedReader(new FileReader(nomFichier)); //ouverture de fichier
            ligne = entree.readLine(); // lire une ligne
            while (ligne != null) {
                listeExpressions.add(ligne);
                ligne = entree.readLine(); // lire une ligne
            }
            entree.close(); //fermeture du fichier
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : " + nomFichier);
        } catch (IOException e) {
            System.out.println("Problème de lecture");
        }
    }

    private void afficher() {
        for (String str : listeExpressions) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new FichierTexte();
    }
}

package formes;

import exceptions.FormeException;

/**
 * Classe Rectangle Tp1 - Illustration des classes, exceptions, validation
 * Utilisation de equals et toString
 *
 * @author Julie.Freve
 */
public class Rectangle extends Forme {
    private int hauteur;
    private int largeur;

    /**
     * Construit un rectangle avec un nom, une hauteur et une largeur validées
     *
     * @param hauteur
     * @param largeur
     * @throws FormeException
     */
    public Rectangle(int hauteur, int largeur) throws FormeException {
        super("Rectangle");

        if (hauteurEstValide(hauteur) && largeurEstValide(largeur)) {
            setHauteur(hauteur);
            setLargeur(largeur);
        } else
            throw new FormeException("Côtés du rectangle invalide");
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setHauteur(int hauteur) {
        if (hauteurEstValide(hauteur))
            this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        if (largeurEstValide(largeur))
            this.largeur = largeur;
    }

    /**
     * Valide la hauteur dans les bornes MINVAL et MAXVAL
     *
     * @param hauteur
     * @return vrai si la valeur hauteur respecte les bornes MINVAL et MAXVAL
     * inclusivement.
     */

    public static boolean hauteurEstValide(int hauteur) {
        return ((hauteur >= MIN_VAL) && (hauteur <= MAX_VAL));
    }

    /**
     * Valide la largeur dans les bornes MINVAL et MAXVAL
     *
     * @param largeur
     * @return vrai si la valeur largeur respecte les bornes MINVAL et MAXVAL
     * inclusivement.
     */
    public static boolean largeurEstValide(int largeur) {
        return ((largeur >= Forme.MIN_VAL) && (largeur <= Forme.MAX_VAL));
    }

    /**
     * Calcule l'aire ou la surface du rectangle selon la formule largeur X
     * hauteur
     *
     * @return surface du rectangle
     */
    @Override
    public int calculerSurface() {
        return getHauteur() * getLargeur();
    }

    /**
     * Calcule le périmètre selon la formule (hauteur + largeur) X 2
     *
     * @return périmètre du rectangle
     */
    @Override
    public int calculerPerimetre() {
        return (getHauteur() + getLargeur()) * 2;
    }

    /**
     * Prépare une chaîne de caractères représentant les valeurs des attributs
     * d'un objet de la classe Rectangle. Soit le nom, couleur, hauteur, largeur
     *
     * @return une chaîne de caractères
     */
    @Override
    public String toString() {
        return super.toString() + " " + getHauteur() + ", " + getLargeur();
    }


}

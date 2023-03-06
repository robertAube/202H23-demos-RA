package formes;

/**
 * Classe abstraite Forme. Pour des formes géométriques Tp2 420-202-LI -
 * Illustration de l'héritage Hiver 2018
 *
 * @author Julie.Freve
 * @author Jocelyn 2015
 */
public abstract class Forme implements Comparable<Forme> {
    public static final int MIN_VAL = 1;
    public static final int MAX_VAL = 30;
    public static final Couleur COULEUR_DEFAUT = Couleur.ROUGE;

    private String nom = null;
    private Couleur couleur = null;

    /**
     * Construit une forme avec le nom reçu
     *
     * @param nom: Nom de la forme
     */
    public Forme(String nom) {
        setCouleur(COULEUR_DEFAUT);
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    /**
     * Affecte la couleur reçu en argument à la forme. Si la couleur reçu est null, la couleur
     * ne sera pas modifiée.
     *
     * @param couleur couleur de la forme
     */
    public void setCouleur(Couleur couleur) {
        if (couleur != null) {
            this.couleur = couleur;
        }
    }

    /**
     * Calcule la surface d'une forme. Méthode de calcul particulière à chaque
     * forme. Permet le polymorphisme
     *
     * @return surface de la forme
     */
    public abstract int calculerSurface();

    /**
     * Calcule le périmètre d'une forme. Méthode de calcul particulière à chaque
     * forme. Permet le polymorphisme
     *
     * @return périmètre de la forme
     */
    public abstract int calculerPerimetre();

    /**
     * Retourne une chaîne avec les propriétés communes à toutes les formes soit
     * nom et couleur
     *
     * @return nom et couleur
     */
    @Override
    public String toString() {
        return getNom() + " " + getCouleur();
    }

    /**
     * Compare une forme selon son nom et sa couleur pour permettre de
     * distinguer un ordre. Conforme à la javaDoc de l'interface Comparable.
     *
     * @param obj l'objet forme à comparer
     * @return Une valeur plus petit que 0 si l'objet courant est plus petit que l'objet en
     * paramètre, 0 si les 2 objets sont égaux et > 0 si l'objet courant
     * est plus grand que l'objet en paramètre
     * @throws NullPointerException , ClassCastException
     */

    /**
     *
     * @param obj the object to be compared.
     * @return
     */
    public int compareTo(Forme obj) {
        return (this.getNom() + this.getCouleur()).compareToIgnoreCase(obj.getNom() + obj.getCouleur());
    }

    /**
     * Vérifie l'égalité entre deux formes. Deux formes sont égales si leur
     * nom, leur surface et leur couleur sont égales
     *
     * @param obj: L'objet avec lequel on compare le courant
     * @return vrai ou faux si les objets sont égaux
     */
    @Override
    public boolean equals(Object obj) {
        boolean egale = false;

        if (obj instanceof Forme) {
            // Commençons par transformer l'object en Forme
            Forme f = (Forme) obj;

            // On vérifie si la surface et la couleur sont égales
            egale = (this.getNom().equals(f.getNom())
                    && (this.calculerSurface() == f.calculerSurface())
                    && this.getCouleur().equals(f.getCouleur()));
        }

        return egale;
    }

}

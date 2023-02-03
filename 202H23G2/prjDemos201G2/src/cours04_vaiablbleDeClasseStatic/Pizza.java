package cours04_vaiablbleDeClasseStatic;

/**
 * C'est une pizza dans un jeu
 * @author Robert Aubé
 * @version 1.0
 */
public class Pizza implements Comparable<Pizza> {
    /**
     * vitesse minimum
     */
    public static final int VITESSE_MIN = 0;
    public static final int VITESSE_MAX = 50;

    /**
     * Représente le nombre d'instances créé. À la destruction le nombre demeure ne dimiinuew pas
     */
    private static int nbInstance = 0;

    // vitesse est entre 0 et 50

    //attributs ou variables d'instance
    //N'existe pas sans instanciation
    private Coordonnee position;

    private int vitesse;
    private String couleur;

    /**
     * Intialise une pizza
     * @param x position X
     * @param y position y
     * @param couleur couleur de la pizza
     * @param vitesse vitesse de déplacement
     */
    Pizza(int x, int y, String couleur, int vitesse) {
        position = new Coordonnee(x, y);
        this.couleur = couleur;
        setVitesse(vitesse);

        nbInstance++;
    }

    public static int getNbInstance() {
        return nbInstance;
    }


    //mutateur
    public void setVitesse(int vitesse) {
        if (estValideVitesse(vitesse)) {
            this.vitesse = vitesse;
        } else {
            throw new RuntimeException("Vitesse " + vitesse + " est invalide.");
        }
    }

    /**
     * valide la vitesse
     * @param vitesse citesse qui est validé
     * @return vrai si la vitesse est valide
     */
    public static boolean estValideVitesse(int vitesse) {
        return VITESSE_MIN <= vitesse && vitesse <= VITESSE_MAX;
    }

    //accesseur
    public int getX() {
        return position.getX();
    }

    //accesseur
    public int getY() {
        return position.getY();
    }

    //accesseur
    public int getVitesse() {
        return vitesse;
    }

    //accesseur
    public String getCouleur() {
        return couleur;
    }

    //Surcharge : 2 méthodes avec le même nom, mais des arguments différents. On dira aussi que la signature est différente.
    public void setXY(int x, int y) {
        position.move(x, y);
    }

    public void setXY(Coordonnee newPosition) {
        if (newPosition != null) {
            position = newPosition;
        } else {
            throw new NullPointerException("La coordonnée n'est pas une instance");
        }
    }

    public static boolean estValideXY(int x, int y) {
        boolean estV;
        estV = Coordonnee.estValideX(x) && Coordonnee.estValideY(y);

        return estV;
    }

    public void avancerX() {
        position.translate(vitesse, 0);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + position.getX() +
                ", y=" + position.getY() +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (vitesse != pizza.vitesse) return false;
        if (position != null ? !position.equals(pizza.position) : pizza.position != null) return false;
        return couleur != null ? couleur.equalsIgnoreCase(pizza.couleur) : pizza.couleur == null;
    }

    @Override
    public int compareTo(Pizza pizza) {
//        return this.couleur.compareTo(pizza.couleur);
        return this.vitesse - pizza.vitesse;
    }
}

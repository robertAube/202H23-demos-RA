package forme;

/**
 * Carre - Démo pour JUnit
 *
 * @author Robert Aubé
 * @version V1.1
 */
public class Carre {
    public static final int COTE_DEFAUT = 1;
    public static final int DIM_MIN = 0;
    public static final int DIM_MAX = 20;

    private int cote;

    public Carre() {
        this(COTE_DEFAUT);
    }

    public Carre(int cote) {
        setCote(cote);
    }

    public void setCote(int cote) {
        if (coteEstValide(cote))
            this.cote = cote;
        else
            throw new IllegalArgumentException(cote + " n'est pas entre " + DIM_MIN + " et " + DIM_MAX +".");
    }

    public int getCote() {
        return cote;
    }

    public static boolean coteEstValide(int cote) {
        return (DIM_MIN <= cote && cote <= DIM_MAX);
    }

    public double getSurface() {
        return (Math.pow(cote, 2));
    }

    public boolean estPlusPetit (Carre c) {
        return this.cote < c.cote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carre carre = (Carre) o;

        return cote == carre.cote;
    }


    public String toString() {
        return (super.toString()
                + "Dimension : " + cote + " x " + cote
                + "Surface : " + getSurface());
    }
}

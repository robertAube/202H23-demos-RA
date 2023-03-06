package formes;

import java.util.Locale;

public enum Couleur {
    ROUGE, VERT, BLEU, JAUNE, NOIR, ORANGE;

    public String getNom() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return getNom();
    }
}
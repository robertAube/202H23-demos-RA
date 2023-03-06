package formesProf;

import exceptions.FormeException;
import formes.*;
import org.junit.jupiter.api.*;

import java.awt.Point;

import static org.junit.jupiter.api.Assertions.*;

class ProfRectangleTest {
    private static Rectangle[] tabRec = new Rectangle[4];
    private static Point[] dimRectangle = {
            new Point(Rectangle.MIN_VAL, Rectangle.MIN_VAL),
            new Point(Rectangle.MAX_VAL, Rectangle.MAX_VAL),
            new Point(10, 5),
            new Point(5, 10),
            new Point(6, 6)
    };
    private static int[] bonneSurface = {
            Rectangle.MIN_VAL * Rectangle.MIN_VAL,
            Rectangle.MAX_VAL * Rectangle.MAX_VAL,
            50,
            50,
            36
    };
    private static int[] bonPerimetre = {
            Rectangle.MIN_VAL * 2 + Rectangle.MIN_VAL * 2,
            Rectangle.MAX_VAL * 2 + Rectangle.MAX_VAL * 2,
            30,
            30,
            36
    };

    @BeforeAll
    public static void leConstructeurCreeDesClassesValidesSansErreur() {
        try {
            for (int i = 0; i < tabRec.length; i++) {
                tabRec[i] = new Rectangle(dimRectangle[i].x, dimRectangle[i].y);
            }
        } catch (FormeException e) {
            fail("Problème de constructreur");
        }
    }

    @Test
    void  leConstructeur_LanceUneException_SiLesDimensionsDuTriangleSontInvalides() {
        assertThrows(FormeException.class, () -> new Rectangle(Rectangle.MIN_VAL - 1, 10));
        assertThrows(FormeException.class, () -> new Rectangle(10, Rectangle.MIN_VAL - 1));
        assertThrows(FormeException.class, () -> new Rectangle(Rectangle.MAX_VAL + 1, 10));
        assertThrows(FormeException.class, () -> new Rectangle(10, Rectangle.MAX_VAL + 1));
    }

    @Test
    void setEtGet_test() {
        Rectangle r;
        int expected;
        int actual;
        try {
            for (int i = 0; i < tabRec.length; i++) {
                r = new Rectangle(11, 11);
                r.setLargeur(dimRectangle[i].x);
                r.setHauteur(dimRectangle[i].y);
                expected = dimRectangle[i].x;
                actual = r.getLargeur();
                assertEquals(expected, actual);
                actual = r.getHauteur();
                expected = dimRectangle[i].y;
                assertEquals(expected, actual);
            }
        } catch (FormeException e) {
            fail("Problème de constructreur");
        }
    }

    @Test
    void getNom_retourneLeBonNom() {
        String strExpected;
        String strActual;
        for (Rectangle r : tabRec) {
            strExpected = r.getClass().getSimpleName();
            strActual = r.getNom();
            assertTrue(strExpected.equalsIgnoreCase(strActual));
        }
    }

    @Test
    void calculerSurface_retourneLaBonneSurface() {
        int expected;
        int actual;
        for (int i = 0; i < tabRec.length; i++) {
            expected = bonneSurface[i];
            actual = tabRec[i].calculerSurface();
            assertEquals(expected, actual);
        }
    }

    @Test
    void calculerPerimetre_retourneLeBonPerimetre() {
        int expected;
        int actual;
        for (int i = 0; i < tabRec.length; i++) {
            expected = bonPerimetre[i];
            actual = tabRec[i].calculerPerimetre();
            assertEquals(expected, actual);
        }
    }

    @Test
    void toString_retounreLaBonneString() {
        String strExpected;
        String strActual;
        for (Rectangle r : tabRec) {
            strExpected = r.getNom() + " " + r.getCouleur() + " " + r.getHauteur() + ", " + r.getLargeur();
            strExpected = strExpected.toLowerCase();
            strActual = r.toString().toLowerCase();
            assertEquals(strExpected, strActual);
        }
        for (Rectangle r : tabRec) {
            r.setCouleur(Couleur.VERT);
        }
        for (Rectangle r : tabRec) {
            strExpected = r.getNom() + " " + r.getCouleur() + " " + r.getHauteur() + ", " + r.getLargeur();
            strExpected = strExpected.toLowerCase();
            strActual = r.toString().toLowerCase();
            assertEquals(strExpected, strActual);
        }
    }
}
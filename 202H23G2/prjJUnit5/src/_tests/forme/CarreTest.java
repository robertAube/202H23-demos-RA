package forme;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarreTest {

    private Carre c1;
    @BeforeAll
    void init() {
        c1 = new Carre();

    }
    @Test
    void getSurface_RetourneLaSurfaceDuCarre() {
        Carre c = new Carre();
        c.setCote(1);
        assertEquals(1, c.getSurface());
        c.setCote(2);
        assertEquals(4, c.getSurface());
    }

    @Test
    void equals_deuxCarreDeMemeDimension_RetourneVrai() {
        Carre c2 = new Carre();
        c1.setCote(3);
        c2.setCote(3);
        assertTrue(c1.equals(c2));
    }
    @Test
    void equals_deuxCarreDeDimensionDimension_RetourneFaux() {
        Carre c1 = new Carre();
        Carre c2 = new Carre();
        c1.setCote(2);
        c2.setCote(3);
        assertFalse(c1.equals(c2));
    }

    @Test
    void setCote_unCoteIvalide_provoqueUneException() {
        Carre c = new Carre();

        assertThrows(IllegalArgumentException.class, () -> {c.setCote(Carre.DIM_MIN - 1);});
        assertThrows(IllegalArgumentException.class, () -> {c.setCote(Carre.DIM_MAX + 1);});
    }
}
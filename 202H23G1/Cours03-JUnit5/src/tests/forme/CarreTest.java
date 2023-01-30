package forme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarreTest {

    @Test
    void getSurface_RetourneLaSurfaceDuCarre() {
        Carre c = new Carre();

        c.setCote(0);
        assertEquals(0, c.getSurface());
        c.setCote(1);
        assertEquals(1, c.getSurface());
        c.setCote(3);
        assertEquals(9, c.getSurface());
    }

    @Test
    void equals_deuxCarreDeMemmeDimension_retourneVrai() {
        Carre c1 = new Carre();
        Carre c2 = new Carre();

        c1.setCote(2);
        c2.setCote(2);

        assertTrue(c1.equals(c2));
    }

    @Test
    void estCote_uneCoteInvalde_provoqueUneException() {
        Carre c = new Carre();

        assertThrows(IllegalArgumentException.class, () -> {c.setCote(-2);});
        assertThrows(IllegalArgumentException.class, () -> {c.setCote(-1);});
        assertThrows(IllegalArgumentException.class, () -> {c.setCote(21);});
    }
}
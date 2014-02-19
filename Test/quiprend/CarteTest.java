package quiprend;

import org.junit.Test;
import quiprend.Carte;

public class CarteTest {

    @Test (expected =  NumeroTropGrandException.class)
    public void testCarteNumeroTropGrand() throws Exception {
        Carte carte = new Carte();
        carte.creerCarte(105);
    }

    @Test (expected =  NumeroTropPetitException.class)
    public void testCarteNumeroTropPetit() throws Exception {
        Carte carte = new Carte();
        carte.creerCarte(0);
    }

    @Test
    public void testCarteOk() throws Exception {
        Carte carte = new Carte();
        carte.creerCarte(83);
    }
}

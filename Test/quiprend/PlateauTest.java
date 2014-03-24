package quiprend;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlateauTest {

    @Test
    public void testNombreCarteParRangeInferieurOuEgalASix() throws Exception {
        for(List<Carte> l : Plateau.getInstance().getTableau()) {
            Assert.assertTrue(l.size() <= 6);
        }
    }

    @Test
    public void testValeurCarteSuperieure() throws Exception {
          Plateau.getInstance().init(Carte.creerCarte(12),Carte.creerCarte(13),Carte.creerCarte(15),Carte.creerCarte(16));
          Plateau.getInstance().addCarteDansRange(1, Carte.creerCarte(30));
          Assert.assertTrue(Plateau.getInstance().getLastCardInRange(1).getNumber() > Plateau.getInstance().getCardBeforeLastInRange(1).getNumber());
    }

    @Test
    public void testValeurCarteInferieure() throws Exception {
        Plateau.getInstance().init(Carte.creerCarte(12),Carte.creerCarte(13),Carte.creerCarte(15),Carte.creerCarte(16));
        Plateau.getInstance().addCarteDansRange(1, Carte.creerCarte(10));
        Assert.assertTrue(Plateau.getInstance().getLastCardInRange(1).getNumber() < Plateau.getInstance().getCardBeforeLastInRange(1).getNumber());
    }

    @Test
    public void testCarteALaFinDeLaRange() throws Exception {
            Carte carte = Carte.creerCarte(4);
            Plateau.getInstance().init(Carte.creerCarte(12), Carte.creerCarte(13), Carte.creerCarte(15), Carte.creerCarte(16));
            Plateau.getInstance().addCarteDansRange(2, Carte.creerCarte(54));
            Assert.assertEquals(1554, Plateau.getInstance().getLastCardInRange(2));
    }

    /*public void testRangeTropGrande() throws Exception {
        Plateau.getInstance().init(Carte.creerCarte(12), Carte.creerCarte(25), Carte.creerCarte(75), Carte.creerCarte(53));
        Plateau.getInstance().addCarteDansRange(1, Carte.creerCarte(73));
        Plateau.getInstance().addCarteDansRange(1,Carte.creerCarte(22));
        Plateau.getInstance().addCarteDansRange(1,Carte.creerCarte(17));
        Plateau.getInstance().addCarteDansRange(1,Carte.creerCarte(89));
        Plateau.getInstance().addCarteDansRange(1,Carte.creerCarte(101));
        ArrayList<Carte> lst = new ArrayList<Carte>();
        lst.add(0,Carte.creerCarte(101));
        // A quel moment la rangée est trop grande là ?
        Assert.assertEquals();
    }*/

    // Faudrait refaire une méthode ici aussi

    // Fin de la méthode qu'l faudrait refaire !


       /* for(ArrayList<Carte> r : Plateau.getInstance().getTableau())
            for (Carte c : r) {
                // System.out.print(c.getNumber() + " | ");
            }
    }*/
}

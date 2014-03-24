package quiprend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plateau {
    private ArrayList<ArrayList<Carte>> tableau = null;
    private static Plateau instance = null;

    private Plateau() {
        this.tableau = new ArrayList<ArrayList<Carte>>();
        tableau.add(new ArrayList<Carte>());
        tableau.add(new ArrayList<Carte>());
        tableau.add(new ArrayList<Carte>());
        tableau.add(new ArrayList<Carte>());
    }

    public static Plateau getInstance() {
        if(instance == null)
            instance = new Plateau();
        return instance;
    }

    public ArrayList<Carte> getRange(int index) {
        return tableau.get(index);
    }

    public int getRangeTaille(int index) {
        return getRange(index).size();
    }

    public ArrayList<ArrayList<Carte>> getTableau() {
        return tableau;
    }
    public void addCarteDansRange(int index, Carte carte) {
        getRange(index).add(carte);
    }

    public Carte getLastCardInRange(int index) {
        return getRange(index).get(getRange(index).size() - 1);
    }

    public Carte getCardBeforeLastInRange(int index) {
        return getRange(index).get(getRange(index).size() - 2);
    }

    public void init(Carte c1, Carte c2, Carte c3, Carte c4) {
        addCarteDansRange(0, c1);
        addCarteDansRange(1, c2);
        addCarteDansRange(2, c3);
        addCarteDansRange(3, c4);
    }

    public int getRangeePossibles(Carte carte){
        int indexRangeeKonVeut = 0, diff = 1000;
        for(int i = 0;i<5;i+=1){
            diff = Plateau.getInstance().getLastCardInRange(i).getNumber() - carte.getNumber() < diff
                    ? Plateau.getInstance().getLastCardInRange(i).getNumber() - carte.getNumber()
                    : diff;

        }

        if (diff == 1000)
        {
            int counter = 0;
            Scanner scan = new Scanner(System.in);
           System.out.println("Vous ne pouvez pas poser cette carte. Indiquez l'index de la rangée à ramasser : ");
           int answer = scan.nextInt();

           for (Carte carte1 : Plateau.getInstance().getRange(answer)){
               counter += carte1.getHeads();
           }





        }




    }


}

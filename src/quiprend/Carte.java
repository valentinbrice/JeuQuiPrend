package quiprend;

public class Carte {
    private int number;
    private int heads;

    public static Carte creerCarte(int number) throws Exception {
        int heads = 0;
        if (number < 1) {
            throw new NumeroTropPetitException();
        }
        if (number > 104){
            throw new NumeroTropGrandException();
        }
        else {
            if (number % 5 == 0 && number % 10 != 0){
                heads = 2;
            }
            if (number % 10 == 0){
                heads = 3;
            }
            if (number % 11 == 0){
                heads += 5;
            }
            else heads = 1;

            return new Carte(number,heads);
        }
    }

    public Carte(){}

    public Carte(int number, int heads){
        this.heads = heads;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHeads() {
        return heads;
    }

    public void setHeads(int heads) {
        this.heads = heads;
    }
}

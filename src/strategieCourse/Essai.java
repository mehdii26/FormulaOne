package strategieCourse;

import main.Pilote;

public class Essai {
    private int numEssai;
    private Pilote pilote;
    private Pneu pneu;
    private int duree;

    public Essai() {
    }

    public int getNumEssai() {
        return numEssai;
    }

    public void setNumEssai(int numEssai) {
        this.numEssai = numEssai;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}

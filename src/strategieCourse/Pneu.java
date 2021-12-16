package strategieCourse;

import atome.Molecule;

import java.util.ArrayList;

public class Pneu {
    private String nom;
    private ArrayList<Molecule> composition;

    public Pneu(String nom, ArrayList<Molecule> composition) {
        this.nom = nom;
        this.composition = composition;
    }

    public Pneu() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Molecule> getComposition() {
        return composition;
    }

    public void setComposition(ArrayList<Molecule> composition) {
        this.composition = composition;
    }
}

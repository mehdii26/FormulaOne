package atome;

import java.util.ArrayList;


public class Atome {
    private String nom;
    private int protons;
    private int neutrons;
    private int electrons;
    private Molecule molecule;
    private static int numAtome = 0;
    private int idAtome;

    public Atome()
    {
        Atome.numAtome++;
        this.nom = "Hydrogene";
        this.protons = 1;
        this.neutrons = 0;
        this.electrons = this.protons;
        this.idAtome = Atome.numAtome;

    }

    public double chargeAtome(int variationElectrons)
    {
        return ((double)(this.protons - (this.electrons + variationElectrons))) * 16 * Math.pow(10, -20);
    }

    public void changeNbElectrons(int nbElectrons){
        this.setElectrons(this.getElectrons() - nbElectrons);
    }


    public boolean inMolecule(Molecule molecule) {
        if (this.molecule == molecule)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    // Setters et getters
    public void setMolecule(Molecule molecule) {
        this.molecule = molecule;
    }

    public Molecule getMolecule() {
        return this.molecule;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNeutrons(int neutrons){
        this.neutrons = neutrons;
    }

    public int getNeutrons(){
        return this.neutrons;
    }

    public void setProtons(int protons){
        this.protons = protons;
    }

    public int getProtons(){
        return this.protons;
    }

    public void setElectrons(int electrons){
        this.electrons = electrons;
    }

    public int getElectrons(){
        return this.electrons;
    }
}

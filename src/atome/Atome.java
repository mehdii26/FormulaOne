package atome;

import java.util.Collection;

public class Atome implements Comparable<Atome>
{
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
        this.nom = "Hydrogène";
        this.protons = 1;
        this.neutrons = 0;
        this.electrons = this.protons;
        this.idAtome = Atome.numAtome;
    }

    public double chargeAtome(int variationElectrons)
    {
        this.setElectrons(this.getElectrons() + variationElectrons);
        return ((double)(this.getProtons() - (this.getElectrons() + variationElectrons))) * 16 * Math.pow(10, -20);
    }

    public boolean lienAtomeMolecule(Molecule molecule) {
        if (this.getMolecule() == molecule)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int compare(Atome a) {
        int primaire = this.getNom().compareTo(a.getNom());
        if(primaire == 1){
            return 1;
        } else if (primaire == 0){
            return 0;
        }
        else {
            return -1;
        }
    }

    public int compareTo(Atome a) {
        int primaire = this.getNom().compareTo(a.getNom());
        if(primaire == 1){
            return 1;
        } else if (primaire == 0){
            return 0;
        }
        else {
            return -1;
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

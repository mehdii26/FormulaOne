package atome;

import java.util.ArrayList;


public class Molecule {
    private ArrayList<Atome> listAtomes;
    private ArrayList<String> liaisonAtomique;
    private String nomMolecule;

    public Molecule()
    {
        this.listAtomes = new ArrayList<Atome>();
        this.liaisonAtomique = new ArrayList<String>();
        this.nomMolecule = "";
    }

    public void ajouterAtome(Atome a)
    {
        this.listAtomes.add(a);
        this.liaisonAtomique.add(a.getNom());
        a.setMolecule(this);
    }

    public void setListAtomes(ArrayList<Atome> listAtomes)
    {
        this.listAtomes = listAtomes ;
    }

    public ArrayList<Atome> getListAtomes()
    {
        return this.listAtomes;
    }

    public void setNomMolecule(String nomMolecule)
    {
        this.nomMolecule = nomMolecule ;
    }

    public String getNomMolecule()
    {
        return this.nomMolecule;
    }

    public boolean containsAtome(Atome a) {
        if (this.listAtomes.contains(a))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

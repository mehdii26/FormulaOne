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
        if (this.listAtomes.size() == 0)
        {
            this.setNomMolecule(a.getNom());
        }
        else
        {
            this.setNomMolecule(this.getNomMolecule() + "-" + a.getNom());
        }
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

    public boolean lienAtomeMolecule(Atome a) {
        if (this.listAtomes.contains(a))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int sommeElectrons(){
        int s = 0;
        for(int i = 0; i < this.getListAtomes().size(); i++){
            s = s + this.getListAtomes().get(i).getElectrons();
        }
        return s;
    }

    public int sommeNeutrons(){
        int s = 0;
        for(int i = 0; i < this.getListAtomes().size(); i++){
            s = s + this.getListAtomes().get(i).getNeutrons();
        }
        return s;
    }

    public String nomenclature(int N){
        String[] listeNom = this.nomMolecule.split("-");
        String nouveauNom = "" + listeNom[0].substring(0, N);
        if (listeNom.length <= 1) {
            return nouveauNom;
        }
        else
        {
            for (int i = 1; i < listeNom.length; i++) {
                nouveauNom = nouveauNom + "-" + listeNom[i].substring(0, N);
            }
            return nouveauNom;
        }
    }


}

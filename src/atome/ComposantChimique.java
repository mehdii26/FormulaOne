package atome;

import java.util.ArrayList;

public class ComposantChimique extends  Molecule{
    private ArrayList <Molecule> molecules;

    public ComposantChimique() {
        this.molecules = new ArrayList<>();
    }

    public ArrayList<Molecule> getMolecules() {
        return molecules;
    }

    public void setMolecules(ArrayList<Molecule> molecules) {
        this.molecules = molecules;
    }

    public void ajouterMolecule (Molecule molecule){
        if (this.molecules.size() == 0)
        {
            this.setNomMolecule(molecule.getNomMolecule());
        }
        else
        {
            this.setNomMolecule(this.getNomMolecule() + "-" + molecule.getNomMolecule());
        }
        this.molecules.add(molecule);
        this.getLiaisonAtomique().add(molecule.getNomMolecule());
    }
}

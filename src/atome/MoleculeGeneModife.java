package atome;

public class MoleculeGeneModife extends Molecule{

    private Atome atomeRef;
    private Molecule molecule;

    public MoleculeGeneModife() {
    }

    public Atome getAtomeRef() {
        return atomeRef;
    }

    public void setAtomeRef(Atome atomeRef) {
        this.atomeRef = atomeRef;
    }

    public Molecule getMolecule() {
        return molecule;
    }

    public void setMolecule(Molecule molecule) {
        this.molecule = molecule;
    }

    public void creerMgm(Atome atome, int nbAtomes) {
        this.setAtomeRef(atome);
        for (int i=0; i<nbAtomes; i++){
            this.getMolecule().ajouterAtome(atome);
        }
    }
}

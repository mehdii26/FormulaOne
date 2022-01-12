package atome;

public class MoleculeGeneModife extends Molecule{

    private Atome atomeRef;

    public MoleculeGeneModife() {
        this.atomeRef = new Atome();
    }

    public Atome getAtomeRef() {
        return atomeRef;
    }

    public void setAtomeRef(Atome atomeRef) {
        this.atomeRef = atomeRef;
    }


    public void creerMgm(Atome atome, int nbAtomes) {
        this.setAtomeRef(atome);
        for (int i=0; i<nbAtomes; i++){
            this.ajouterAtome(atome);
        }
    }
}

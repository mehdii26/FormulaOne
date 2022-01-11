package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import atome.Atome;
import atome.Molecule;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs_us_100_inventaire {

    private Molecule molecule;
    private Atome hydrogene;
    private Atome lithium;

    private int totalElectrons;

    @Given("un atome d'hydrogene et un atome de lithium")
    public void un_atome_d_hydrogene_et_un_atome_de_lithium() {
        this.molecule = new Molecule();

        this.hydrogene = new Atome();
        this.hydrogene.setMolecule(this.molecule);

        this.lithium = new Atome();
        this.lithium.setElectrons(3);
        this.lithium.setProtons(3);
        this.lithium.setNom("Lithium");
        this.lithium.setNeutrons(0);
        this.lithium.setMolecule(this.molecule);

        this.molecule.ajouterAtome(this.hydrogene);
        this.molecule.ajouterAtome(this.lithium);
    }

    @Given("un nombre d'électrons modifié de {int}")
    public void changementNbElectronsHydrogene(int nbElectrons1){
        this.molecule.getListAtomes().get(0).chargeAtome(nbElectrons1);
    }

    @Given("Un changement du nombre d'électrons du lithium de {int}")
    public void changementNbElectronsLithium(int nbElectrons2) {
        this.molecule.getListAtomes().get(1).chargeAtome(nbElectrons2);
    }

    @When("l'utilisateur compte les éléctrons après un calcul de charge")
    public void utilisateurCompteElectronsApresModification() {
        this.totalElectrons = this.molecule.sommeElectrons();
    }

    @Then("il nous reste un {int} éléctrons")
    public void TotalElectrons(int total) {
        assertEquals(Integer.valueOf(total), this.totalElectrons);
    }

    private Molecule molecule2;
    private int sommeNeutrons;

    @Given("une molécule")
    public void uneMolecule() {
        this.molecule2 = new Molecule();

        this.hydrogene = new Atome();
        this.hydrogene.setMolecule(this.molecule);

        this.lithium = new Atome();
        this.lithium.setElectrons(3);
        this.lithium.setProtons(3);
        this.lithium.setNom("Lithium");
        this.lithium.setNeutrons(0);
        this.lithium.setMolecule(this.molecule);

        this.molecule2.ajouterAtome(this.hydrogene);
        this.molecule2.ajouterAtome(this.lithium);
    }

    @When("l'utilisateur compte les neutrons, dans le doute même si ça ne sert à rien")
    public void utilisateurCompteNeutrons() {
        this.sommeNeutrons = this.molecule2.sommeNeutrons();
    }

    @Then("nous aurons un total de neutrons qui ne changera rien à la charge de notre molécule")
    public void totalNeutrons() {
        assertEquals(0, this.sommeNeutrons);
    }

}

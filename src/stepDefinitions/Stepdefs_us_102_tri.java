package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import atome.Atome;
import atome.Molecule;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs_us_102_tri {

        private Molecule molecule;
        private Atome hydrogene;
        private Atome oxygene;
        private Atome uranium;

        @Given("une molécule contenant plusieurs atomes")
        public void pourUneMolecule() {
                this.molecule = new Molecule();

                this.uranium = new Atome();
                this.uranium.setElectrons(92);
                this.uranium.setProtons(92);
                this.uranium.setNom("Uranium");
                this.uranium.setNeutrons(0);
                this.uranium.setMolecule(this.molecule);

                this.oxygene = new Atome();
                this.oxygene.setElectrons(8);
                this.oxygene.setProtons(8);
                this.oxygene.setNom("Oxygène");
                this.oxygene.setNeutrons(0);
                this.oxygene.setMolecule(this.molecule);

                this.hydrogene = new Atome();
                this.hydrogene.setMolecule(this.molecule);

                this.molecule.ajouterAtome(this.uranium);
                this.molecule.ajouterAtome(this.oxygene);
                this.molecule.ajouterAtome(this.hydrogene);

        }

        @When("je choisis de trier les atomes selon l'ordre alphabétique")
        public void jeTriAlphabetiquement() {
                Collections.sort(this.molecule.getListAtomes());
        }

        @Then("j'obtiens une nouvelle liste ordonnancée")
        public void onObtientLaListeTriee() {
                ArrayList<Atome> tmp = new ArrayList<Atome>();
                tmp.add(this.hydrogene);
                tmp.add(this.oxygene);
                tmp.add(this.uranium);
                assertEquals(tmp, this.molecule.getListAtomes());
        }

}

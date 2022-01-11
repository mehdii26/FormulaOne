package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import atome.Atome;
import atome.Molecule;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs_us_101_nomenclature {

        private Molecule oxylit;
        private Atome oxygene;
        private Atome lithium;

        private String nouveauNom;

        @Given("une molécule au hasard")
        public void uneMoleculeAuHasard() {
            this.oxylit = new Molecule();

            this.oxygene = new Atome();
            this.oxygene.setElectrons(8);
            this.oxygene.setProtons(8);
            this.oxygene.setNom("Oxygène");
            this.oxygene.setNeutrons(0);
            this.oxygene.setMolecule(this.oxylit);

            this.lithium = new Atome();
            this.lithium.setElectrons(3);
            this.lithium.setProtons(3);
            this.lithium.setNom("Lithium");
            this.lithium.setNeutrons(0);
            this.lithium.setMolecule(this.oxylit);

            this.oxylit.ajouterAtome(this.oxygene);
            this.oxylit.ajouterAtome(this.lithium);
        }


        @When("je change la nomenclature")
        public void changeNomenclature() {
            this.nouveauNom = this.oxylit.nomenclature(5);
        }

        @Then("le nom de la molécule est changé")
        public void onAChangeLeNom() {
            assertEquals("Oxygè-Lithi", this.nouveauNom);
        }

}

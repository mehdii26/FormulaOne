package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Pilote;
import strategieCourse.Essai;
import strategieCourse.Pneu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefs_US011_ChoisirPneu {

    private Essai essai1;
    private Essai essai2;
    private Pilote pilote;
    private Pneu pneu1;
    private Pneu pneu2;

    @Given("l'essai numero {int} avec {string}")
            public void initierEssai1(int arg0, String arg1){
            this.pilote = new Pilote();
            this.essai1 = new Essai();
            this.pneu1 = new Pneu();
            this.pneu1.setNom(arg1);
            this.essai1.setNumEssai(arg0);
            this.essai1.setPilote(this.pilote);
            this.essai1.setPneu(this.pneu1);
        };

    @Given("et l'essai numero {int} avec {string}")
        public void initierEssai2 (Integer arg0, String arg1){
            this.essai2 = new Essai();
            this.pneu2 = new Pneu();
            this.essai2.setNumEssai(arg0);
            this.essai2.setPilote(this.pilote);
            this.pneu2.setNom(arg1);
            this.essai2.setPneu(this.pneu2);
        };

        @When("^(\\d+) de essai1 est inferieur a (\\d+) de essai2$")
        public void comparerEssai1EtEssai2(Integer arg0, Integer arg1)  {
            this.essai1.setDuree(arg0);
            this.essai2.setDuree(arg1);
        };

        @Then("le {string} est selectionne automatiquement")
        public void choisirStrategie(String arg0) {
            assertEquals(arg0, this.essai1.getPneu().getNom());
        };

}

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

    @Given("l'essai numero {int} avec {String}")
    public void instancierEssai1(int numEssai, String typePneu){
        this.pilote = new Pilote();
        this.essai1 = new Essai();
        this.pneu1 = new Pneu();
        this.essai1.setNumEssai(numEssai);
        this.essai1.setPilote(this.pilote);
        this.pneu1.setNom(typePneu);
        this.essai2.setPneu(this.pneu2);
    }

    @Given("et l'essai numero {int} avec {String}")
    public void instancierEssai2(int numEssai, String typePneu){
        this.essai2 = new Essai();
        this.pneu2 = new Pneu();
        this.essai2.setNumEssai(numEssai);
        this.essai2.setPilote(this.pilote);
        this.pneu2.setNom(typePneu);
        this.essai2.setPneu(this.pneu2);
    }

    @When("{int} de essai1 est inferieur a {int} de essai2")
    public void setEssaiTimes(int durre1, int durre2){
        this.essai1.setDuree(durre1);
        this.essai2.setDuree(durre2);
    }

    @Then("le {String} est selectionne automatiquement")
    public void verifierPneuChoisi(String pneuType){
        assertEquals(pneuType, this.essai1.getPneu().getNom());
    }
}



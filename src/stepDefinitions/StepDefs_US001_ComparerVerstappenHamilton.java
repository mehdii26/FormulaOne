package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Equipe;
import main.Pilote;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;

public class StepDefs_US001_ComparerVerstappenHamilton {

    private Equipe equipe;

    @Given("l'equipe dont les pilotes sont")
    public void pilotes(){
        this.equipe = new Equipe();
    }

    @Given("le pilote {Pilote} qui a {int}")
    public void pilote1Equipe(Pilote pilote1, int points1){
        ArrayList <Pilote> pilotes = new ArrayList<Pilote>();
        pilotes.add(pilote1);
        this.equipe.setPilotes(pilotes);
        pilote1.setEquipe(this.equipe);
        pilote1.setPoints(points1);
    }

    @Given("le pilote {Pilote} qui a {int}")
    public void pilote2Equipe(Pilote pilote2, int points2){
        ArrayList <Pilote> pilotes = new ArrayList<Pilote>();
        pilotes.add(pilote2);
        this.equipe.setPilotes(pilotes);
        pilote2.setEquipe(this.equipe);
        pilote2.setPoints(points2);
    }

    @When("le Race Director calcule les points")
    public void calculerTotal(Pilote pilote){
        this.equipe.setPoints(this.equipe.getPoints() + pilote.getPoints());
    }

    @Then("le {int} doit etre calculé automatiquement.")
    public void totalPointsComputed(int points){
        assertEquals(Integer.valueOf(points), this.equipe.getPoints());
    }
}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Equipe;
import main.Pilote;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;

public class StepDefs_US001_CalculerPointsEquipe {

    private Equipe equipe;
    private Pilote pilote1;
    private Pilote pilote2;

    @Given("l'equipe dont les pilotes sont")
    public void pilotes(){
        this.equipe = new Equipe();
        this.pilote1 = new Pilote();
        this.pilote2 = new Pilote();
        ArrayList <Pilote> pilotes = new ArrayList<Pilote>();
        pilotes.add(pilote1);
        pilotes.add(pilote2);
        this.equipe.setPilotes(pilotes);
        this.pilote1.setEquipe(this.equipe);
        this.pilote2.setEquipe(this.equipe);
    }

    @Given("le pilote1 qui a {int}")
    public void pilote1Equipe(int points1){
        this.pilote1.setPoints(points1);
    }

    @Given("le pilote2 qui a {int}")
    public void pilote2Equipe(int points2){
        this.pilote2.setPoints(points2);
    }

    @When("le Race Director calcule les points")
    public void calculerTotal(){
        this.equipe.setPoints(this.pilote1.getPoints() + this.pilote2.getPoints());
    }

    @Then("le {int} doit etre calculé automatiquement.")
    public void totalPointsComputed(int points){
        assertEquals(Integer.valueOf(points), this.equipe.getPoints());
    }

}

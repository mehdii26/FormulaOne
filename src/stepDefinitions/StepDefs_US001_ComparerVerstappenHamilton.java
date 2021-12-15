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

    @Given("^l'equipe dont les pilotes sont$")
    public void pilotes(){
        this.equipe = new Equipe();
    }

    @Given("^le pilote (.*) qui a (\\d+)$")
    public void pilotesEquipe(Pilote pilote1, int points1){
        ArrayList <Pilote> pilotes = new ArrayList<Pilote>();
        pilotes.add(pilote1);
        this.equipe.setPilotes(pilotes);
        pilote1.setEquipe(this.equipe);
        pilote1.setPoints(points1);
    }

    @When("le Race Director calcule les points$")
    public void calculerTotal(Pilote pilote){
        this.equipe.setPoints(this.equipe.getPoints() + pilote.getPoints());
    }

    @Then("le (\\d+ ) doit etre calculé automatiquement\\.$")
    public void totalPointsComputed(int points){
        assertEquals(Integer.valueOf(points), this.equipe.getPoints());
    }
}

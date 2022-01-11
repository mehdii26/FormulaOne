package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Course;
import main.Equipe;
import main.Pilote;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefs_US004_AttribuerPointsCourse {
    private Course course;
    private Pilote pilote1;
    private Pilote pilote2;
    private Equipe equipe1;
    private Equipe equipe2;

    @Given("la derniere course de l'annee")
    public void instancierCourse(){
        this.course = new Course();
    }

    @And("le pilote1 qui avait {int} points avant la course a gagne")
    public void lePiloteQuiAvaitPointsPointsAvantLaCourseAGagne(int arg1) {
        this.pilote1 = new Pilote();
        this.pilote1.setPoints(arg1);
        this.equipe1 = new Equipe();
        this.pilote1.setEquipe(this.equipe1);
        this.course.setWinner(this.pilote1);
    }

    @And("le pilote2 qui avait {int} points avant la course est deuxieme")
    public void lePiloteQuiAvaitPointsPointsAvantLaCourseEstDeuxieme(int arg1) {
        this.pilote2 = new Pilote();
        this.pilote2.setPoints(arg1);
        this.equipe2 = new Equipe();
        this.pilote2.setEquipe(this.equipe2);
        this.course.setSecond(this.pilote2);
    }

    @When("le Race Director attribue les points de la course")
    public void leRaceDirectorAttribueLesPointsDeLaCourse() {
        this.course.classement(this.pilote1);
        this.course.classement(this.pilote2);
    }

    @Then("le {int} et {int} doivent etre calculés automatiquement.")
    public void lePointsFinauxEtPointsFinauxDoiventEtreCalculesAutomatiquement(int arg0, int arg1) {
        assertEquals(Integer.valueOf(arg0), this.pilote1.getPoints());
        assertEquals(Integer.valueOf(arg1), this.pilote2.getPoints());
    }
}

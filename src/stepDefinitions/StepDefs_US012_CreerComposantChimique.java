package stepDefinitions;

import atome.ComposantChimique;
import atome.Molecule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefs_US012_CreerComposantChimique {

    private Molecule molecule1;
    private Molecule molecule2;
    private Molecule molecule3;
    private ComposantChimique composant;

    @Given("une molecule de {string}")
    public void creerPremiereMolecule(String nomMolecule){
        this.molecule1 = new Molecule();
        this.molecule1.setNomMolecule(nomMolecule);
    }

    @And("une deuxieme molecule de {string}")
    public void creerDeuxiemeMolecule(String nomMolecule){
        this.molecule2 = new Molecule();
        this.molecule2.setNomMolecule(nomMolecule);
    }

    @And("une dernire molecule de {string}")
    public void creerTroisemeMolecule(String nomMolecule){
        this.molecule3 = new Molecule();
        this.molecule3.setNomMolecule(nomMolecule);
    }
    @When("le chimiste les combine pour creer le composant chimique")
    public void creerComposantChimique(){
        this.composant = new ComposantChimique();
        this.composant.ajouterMolecule(this.molecule1);
        this.composant.ajouterMolecule(this.molecule2);
        this.composant.ajouterMolecule(this.molecule3);
    }

    @Then("le {string} est construit a partir de la concatenation des noms des molecules")
    public void verifierNomComposantChimique(String nomComposant){
        assertEquals(nomComposant, this.composant.getNomMolecule());
    }

}

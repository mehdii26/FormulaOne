package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ChampionnatTest {

    //Pilotes
    private Pilote SuperMax;
    private Pilote Checo;
    private Pilote Bottas;
    private Pilote Hamilton;
    private Pilote Sainz;
    private Pilote Leclerc;
    private Pilote Lando;
    private Pilote Ricciardo;

    //Equipes
    private Equipe RedBull;
    private Equipe Mercedes;
    private Equipe McLaren;
    private Equipe Ferrari;

    //main.Course
    private Course AbuDhabiGP;



    /**
     * Constructeur de la classe-test PiloteTest
     */
    public ChampionnatTest()
    {
    }


    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Chauffeurs
        SuperMax = new Pilote();
        Hamilton = new Pilote();
        Checo = new Pilote();
        Bottas = new Pilote();
        Sainz = new Pilote();
        Leclerc = new Pilote();
        Lando = new Pilote();
        Ricciardo = new Pilote();

        //Equipes
        Mercedes = new Equipe();
        RedBull = new Equipe();
        Ferrari = new Equipe();
        McLaren = new Equipe();



        //Points chauffeurs
        SuperMax.setPoints(369);
        Hamilton.setPoints(369);
        Checo.setPoints(190);
        Bottas.setPoints(218);
        Lando.setPoints(154);
        Sainz.setPoints(149);
        Leclerc.setPoints(158);
        Ricciardo.setPoints(115);

        //Equipes chauffeurs
        SuperMax.setEquipe(RedBull);
        Checo.setEquipe(RedBull);
        Hamilton.setEquipe(Mercedes);
        Bottas.setEquipe(Mercedes);
        Sainz.setEquipe(Ferrari);
        Leclerc.setEquipe(Ferrari);
        Lando.setEquipe(McLaren);
        Ricciardo.setEquipe(McLaren);

        //Initialisation équipes
        ArrayList <Pilote> rbDrivers= new ArrayList();
        rbDrivers.add(Checo);
        rbDrivers.add(SuperMax);
        RedBull.setPilotes(rbDrivers);

        ArrayList <Pilote> merDrivers= new ArrayList();
        merDrivers.add(Hamilton);
        merDrivers.add(Bottas);
        Mercedes.setPilotes(merDrivers);

        ArrayList <Pilote> ferrariDrivers= new ArrayList();
        ferrariDrivers.add(Leclerc);
        ferrariDrivers.add(Sainz);
        Ferrari.setPilotes(ferrariDrivers);

        ArrayList <Pilote> mclarenDrivers= new ArrayList();
        mclarenDrivers.add(Lando);
        mclarenDrivers.add(Ricciardo);
        McLaren.setPilotes(mclarenDrivers);

        RedBull.setPoints(SuperMax.getPoints() + Checo.getPoints());
        Mercedes.setPoints(Hamilton.getPoints() + Bottas.getPoints());
        Ferrari.setPoints( Sainz.getPoints() + Leclerc.getPoints() );
        McLaren.setPoints(Lando.getPoints()+Ricciardo.getPoints());

        //main.Course
        AbuDhabiGP = new Course(SuperMax, Hamilton, Sainz, Bottas, Lando, Leclerc, Ricciardo, Checo);

        //Points après la course
        AbuDhabiGP.Classement(SuperMax);
        AbuDhabiGP.Classement(Bottas);
        AbuDhabiGP.Classement(Hamilton);
        AbuDhabiGP.Classement(Checo);
        AbuDhabiGP.Classement(Leclerc);
        AbuDhabiGP.Classement(Lando);
        AbuDhabiGP.Classement(Sainz);
        AbuDhabiGP.Classement(Ricciardo);
    }


    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //LibÃ©rez ici les ressources engagÃ©es par setUp()
    }

    @Test
    public void beatTest()
    {
        assertEquals(true, SuperMax.beat(Hamilton));
    }

    @Test
    public void testWinChampionshipPilote()
    {
        //
        ArrayList <Integer> pilotesPoints= new ArrayList();

        //Liste points pilotes
        pilotesPoints.add(SuperMax.getPoints());
        pilotesPoints.add(Checo.getPoints());
        pilotesPoints.add(Hamilton.getPoints());
        pilotesPoints.add(Bottas.getPoints());
        pilotesPoints.add(Sainz.getPoints());
        pilotesPoints.add(Leclerc.getPoints());
        pilotesPoints.add(Ricciardo.getPoints());
        pilotesPoints.add(Lando.getPoints());

        assertEquals(true, SuperMax.winChampionshipPilote(pilotesPoints));
        assertEquals(false, Checo.winChampionshipPilote(pilotesPoints));
        assertEquals(false, Hamilton.winChampionshipPilote(pilotesPoints));
        assertEquals(false, Bottas.winChampionshipPilote(pilotesPoints));
        assertEquals(false, Sainz.winChampionshipPilote(pilotesPoints));
        assertEquals(false, Leclerc.winChampionshipPilote(pilotesPoints));
        assertEquals(false, Ricciardo.winChampionshipPilote(pilotesPoints));
        assertEquals(false, Lando.winChampionshipPilote(pilotesPoints));

    }

    @Test
    public void testWinChampionshipConstructeur() {
        ArrayList <Integer> Constructeurs= new ArrayList();
        Constructeurs.add(SuperMax.getPoints() + Checo.getPoints());
        Constructeurs.add(Hamilton.getPoints() + Bottas.getPoints());
        Constructeurs.add(Sainz.getPoints() + Leclerc.getPoints());
        Constructeurs.add(Ricciardo.getPoints() + Lando.getPoints());

        assertEquals(true, Mercedes.winChampionshipConstructeur(Constructeurs));
        assertEquals(false, RedBull.winChampionshipConstructeur(Constructeurs));
        assertEquals(false, McLaren.winChampionshipConstructeur(Constructeurs));
        assertEquals(false, Ferrari.winChampionshipConstructeur(Constructeurs));

    }

    @Test
    public void testEquipeGetPoints() {
        assertEquals(this.Mercedes.getPoints(), (this.Hamilton.getPoints() + this.Bottas.getPoints()));
    }

}

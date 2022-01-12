package atome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AtomeTest
{
    private Atome hydrogene;
    private Atome lithium;
    private Noyau noyauHydrogene;
    private Molecule mol1;

    /**
     * Constructeur de la classe-test AtomeTest
     */
    public AtomeTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * MÃ©thode appelÃ©e avant chaque appel de mÃ©thode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        hydrogene = new Atome();

        noyauHydrogene = new Noyau();

        mol1 = new Molecule();
        mol1.ajouterAtome(hydrogene);

        lithium = new Atome();
        lithium.setElectrons(3);
        lithium.setNeutrons(0);
        lithium.setNom("Lithium");
        lithium.setProtons(3);
        mol1.ajouterAtome(lithium);

    }

    /**
     * Supprime les engagements
     *
     * MÃ©thode appelÃ©e aprÃ¨s chaque appel de mÃ©thode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //LibÃ©rez ici les ressources engagÃ©es par setUp()
    }

    @Test
    public void testChargeAtome()
    {
        assertEquals(1.6E-19, hydrogene.chargeAtome(-1), 0.1);
    }

    @Test
    public void testExplosionNoyau()
    {
        assertEquals(2.7E-46, noyauHydrogene.explosionNoyau(-1), 0.1);
    }

    @Test
    public void testSommeElectrons(){
        assertEquals(4, mol1.sommeElectrons());
    }

    @Test
    public void testSommeNeutrons(){
        assertEquals(0, mol1.sommeNeutrons());
    }

    @Test
    public void testNomenclature(){
        assertEquals("Hyd-Lit", mol1.nomenclature(3));
    }

    @Test
    public void testContainsAtome()
    {
        checkLien(hydrogene, mol1);
    }

    private void checkLien(Atome a, Molecule m) {
        assertTrue(m.lienAtomeMolecule(a));
        assertTrue(a.lienAtomeMolecule(m));
    }
}



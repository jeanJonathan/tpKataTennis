import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JeuTest {

    private Jeu jeu;

    @BeforeEach
    void setUp() {
        jeu = new Jeu("Joueur 1", "Joueur 2");
    }

    @Test
    void testInitialisation() {
        Assertions.assertEquals("0 - 0", jeu.getScore());
    }

    @Test
    void testMarquerPointsSimple() {
        jeu.marquerPoint(jeu.getJoueur1());
        Assertions.assertEquals("15 - 0", jeu.getScore());

        jeu.marquerPoint(jeu.getJoueur1());
        Assertions.assertEquals("30 - 0", jeu.getScore());

        jeu.marquerPoint(jeu.getJoueur1());
        Assertions.assertEquals("40 - 0", jeu.getScore());
    }

    @Test
    void testVictoireSimple() {
        jeu.marquerPoint(jeu.getJoueur1());
        jeu.marquerPoint(jeu.getJoueur1());
        jeu.marquerPoint(jeu.getJoueur1());
        jeu.marquerPoint(jeu.getJoueur1());

        Assertions.assertEquals("0 - 0", jeu.getScore());
    }

}

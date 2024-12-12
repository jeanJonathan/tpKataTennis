
public class Joueur {

    private String nom;
    private int score;
    private boolean aAvantage;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0; // Le score commence toujours à 0
        this.aAvantage = false; // Pas d'avantage au départ
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    // Indique si le joueur a l'avantage
    public boolean aAvantage() {
        return aAvantage;
    }

    public void ajouterPoint() {
        if (score == 0) {
            score = 15;
        } else if (score == 15) {
            score = 30;
        } else if (score == 30) {
            score = 40;
        }
    }

    public void donnerAvantage() {
        this.aAvantage = true;
    }

    public void retirerAvantage() {
        this.aAvantage = false;
    }

    public void reinitialiser() {
        this.score = 0;
        this.aAvantage = false;
    }

    public String getScoreTexte() {
        if (score == 0) {
            return "0";
        } else if (score == 15) {
            return "15";
        } else if (score == 30) {
            return "30";
        } else if (score == 40) {
            return "40";
        } else {
            return "Erreur";
        }
    }
}

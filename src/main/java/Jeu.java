

public class Jeu {

    private Joueur joueur1;
    private Joueur joueur2;

    public Jeu(String nomJoueur1, String nomJoueur2) {
        this.joueur1 = new Joueur(nomJoueur1);
        this.joueur2 = new Joueur(nomJoueur2);
    }

    // Marque un point pour un joueur donné
    public void marquerPoint(Joueur joueur) {
        Joueur autreJoueur = (joueur == joueur1) ? joueur2 : joueur1;

        if (joueur.getScore() < 40) {
            joueur.ajouterPoint();
        } else if (joueur.getScore() == 40 && autreJoueur.getScore() < 40) {
            joueur.reinitialiser();
            autreJoueur.reinitialiser();
            System.out.println(joueur.getNom() + " gagne le jeu !");
        } else if (joueur.getScore() == 40 && autreJoueur.getScore() == 40) {
            if (!joueur.aAvantage() && !autreJoueur.aAvantage()) {
                joueur.donnerAvantage();
                System.out.println(joueur.getNom() + " a l'avantage !");
            } else if (joueur.aAvantage()) {
                joueur.reinitialiser();
                autreJoueur.reinitialiser();
                System.out.println(joueur.getNom() + " gagne le jeu !");
            } else if (autreJoueur.aAvantage()) {
                autreJoueur.retirerAvantage();
                System.out.println("Égalité !");
            }
        }
    }

    // Récupère le score lisible du jeu
    public String getScore() {
        if (joueur1.getScore() == 40 && joueur2.getScore() == 40) {
            if (joueur1.aAvantage()) {
                return "Avantage " + joueur1.getNom();
            } else if (joueur2.aAvantage()) {
                return "Avantage " + joueur2.getNom();
            } else {
                return "Égalité";
            }
        }
        return joueur1.getScoreTexte() + " - " + joueur2.getScoreTexte();
    }

    // Accesseurs pour les joueurs
    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }
}

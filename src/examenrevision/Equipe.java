package examenrevision;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Equipe {

    private int id;
    private String nom;
    private String pays;
    private List<Joueur> joueurs;

    public Equipe() {
        joueurs = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public String toString() {
        return "Equipe{" + "id=" + id + ", nom=" + nom + ", pays=" + pays + ", joueurs=" + joueurs + '}';
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Equipe)) return false;
        Equipe e = (Equipe)obj;
        return e.id == this.id;
    }

    public void addJoueur(Joueur j) {
        joueurs.add(j);
    }

    public void supprimerJoueur(Joueur j) {
        joueurs.remove(j);
    }

    /* TODO 1 */
    public boolean rechercherJoueurParNationalite(String nationalite) {
        return joueurs.stream().anyMatch(j1 -> j1.getNationalite().equals(nationalite));
    }

    /* TODO 2 */
    public Map<String, List<Joueur>> regrouperParNationalite() {
        return joueurs.stream().collect(Collectors.groupingBy(Joueur::getNationalite));
    }

}

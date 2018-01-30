/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevision;

/**
 *
 * @author Seif
 */
public class ExamenRevision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Competitions */
        Competition c1 = new Competition();
        c1.setId(1);
        c1.setNom("Comp1");
        
        Competition c2 = new Competition();
        c2.setId(2);
        c2.setNom("Comp2");
        
        Competition c3 = new Competition();
        c3.setId(3);
        c3.setNom("Comp3");
        
        /* Joueurs */
        Joueur j1 = new Joueur();
        j1.setId(1);
        j1.setNationalite("Tunisienne");
        j1.setNom("Mouhamed");
        
        Joueur j2 = new Joueur();
        j2.setId(2);
        j2.setNationalite("Italienne");
        j2.setNom("Alfredo");
        
        Joueur j3 = new Joueur();
        j3.setId(3);
        j3.setNationalite("Marocaine");
        j3.setNom("Ali");
        
        Joueur j4 = new Joueur();
        j4.setId(4);
        j4.setNationalite("Algerienne");
        j4.setNom("Tarek");
        
        Joueur j5 = new Joueur();
        j5.setId(5);
        j5.setNationalite("Francaise");
        j5.setNom("Thomas");
        
        Joueur j6 = new Joueur();
        j6.setId(6);
        j6.setNationalite("Tunisienne");
        j6.setNom("Seif");
        
        Joueur j7 = new Joueur();
        j7.setId(7);
        j7.setNationalite("Egyptienne");
        j7.setNom("Mahmoud");
        
        Joueur j8 = new Joueur();
        j8.setId(8);
        j8.setNationalite("Englaise");
        j8.setNom("Mark");
        
        /* Equipes */
        Equipe e1 = new Equipe();
        e1.setId(1);
        e1.setNom("CSS");
        e1.setPays("Tunisie");
        e1.addJoueur(j1);
        e1.addJoueur(j2);
        e1.addJoueur(j3);
        
        Equipe e2 = new Equipe();
        e2.setId(2);
        e2.setNom("PSG");
        e2.setPays("France");
        e2.addJoueur(j4);
        e2.addJoueur(j5);
        
        Equipe e3 = new Equipe();
        e3.setId(3);
        e3.setNom("Manchester");
        e3.setPays("angleterre");
        e3.addJoueur(j6);
        e3.addJoueur(j7);
        e3.addJoueur(j8);
        
        
        Fifa f = new Fifa();
        
        f.ajouterEquipe(c1, e1);
        f.ajouterEquipe(c1, e2);
        f.ajouterEquipe(c1, e3);
        
        f.ajouterEquipe(c2, e2);
        f.ajouterEquipe(c2, e3);
        
        f.ajouterEquipe(c3, e3);
        f.ajouterEquipe(c3, e1);
        
        
        System.out.println(f.retournerEquipesParPays("Tunisie"));
    }
    
}

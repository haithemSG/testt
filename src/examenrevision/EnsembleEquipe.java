package examenrevision;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EnsembleEquipe {

    public Set<Equipe> equipes;
    
    public EnsembleEquipe(){
        equipes = new HashSet<>();
    }

    public Set<Equipe> getEquipes() {
        return equipes;
    }

    public void ajouterEquipe(Equipe e) {
        equipes.add(e);
    }

    public void supprimerEquipe(Equipe e) {
        equipes.remove(e);
    }

    /* TODO 3 */
    public boolean rechercherEquipe(Equipe e) {
        return equipes.contains(e);
    }

    /* TODO 4 */
    public void AfficherEquipes() {
        equipes.forEach(System.out::println);
    }

    /* TODO 5 */
   
//    public Set<Equipe> trierEquipesParNom()
//    {
//        return equipes.stream().collect(Collectors.toCollection(()->new TreeSet<>((a,b)->a.getNom().compareTo(b.getNom()))));
//    }
}

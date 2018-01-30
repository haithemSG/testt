package examenrevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fifa {

    private Map<Competition, EnsembleEquipe> mapFifa;

    public Fifa() {
        mapFifa = new HashMap<>();
    }

    /* TODO 6 */
    public void ajouterCompetition(Competition c){
        mapFifa.put(c, new EnsembleEquipe());
    }
    
    /* TODO 7 */
   public void ajouterEquipe(Competition c, Equipe e) {
        if (mapFifa.containsKey(c)) {
            mapFifa.get(c).ajouterEquipe(e);
        } else {
            ajouterCompetition(c);
            mapFifa.get(c).ajouterEquipe(e);

        }
    }
/* TODO 8 */
    public void afficherFifa(){
        mapFifa.forEach((c, en) -> 
            {
                System.out.println(c+" {");
                en.AfficherEquipes();
                System.out.println(" }");
            }
        );
    }
    
//    public void afficherFifa() {
//        mapFifa.entrySet().forEach(e -> System.out.println("Competition: " + e.getKey() + " Equipes: " + e.getValue()));
//    }
    
    /* TODO 9 */
    public List<Equipe> retournerEquipesParPays(String nom){
        return mapFifa.values().stream().map(en -> en.getEquipes())
                .flatMap(le -> le.stream())
                .filter(e -> e.getPays().equals(nom))
                .collect(Collectors.toList());
    }
    
    /* TODO 10 */
    public void afficherEquipePersonalisees(Competition c, String nationalite){
        mapFifa.get(c).getEquipes().stream().forEach(e -> {
            if(e.getJoueurs().stream().anyMatch(j -> j.getNationalite().equals(nationalite)))
                System.out.println(e);
        });
    }
//     public void afficherEquipesPersonalisees(Competition c, String nationalite) {
//        mapFifa.get(c).getEquipes().stream().flatMap(p -> p.getJoueurs().stream())
//                .filter(p -> p.getNationalite().equals(nationalite)).forEach(System.out::println);
//    }
    
    /* TODO 11 */
    public List<Competition> retournerCompetitionParJoueurTunisien(){
        List<Competition> lc = new ArrayList<>();
        mapFifa.forEach((c, en) -> {
            if(en.getEquipes().stream().anyMatch(e -> e.getJoueurs().stream().anyMatch(j -> j.getNationalite().equals("Tunisienne"))))
                lc.add(c);
        });
        return lc;
    }
    
    /* TODO 12 */
    public boolean returnSiUneEquipeParticpeEnPlusieursCompetitions(){
        List<Equipe> l = mapFifa.values().stream().map(en -> en.getEquipes()).flatMap(le -> le.stream()).collect(Collectors.toList());
        return l.stream().anyMatch(e -> Collections.frequency(l, e)>1);
    }
}

package examenrevision;

public class Competition {

    private int id;
    private String nom;

    public Competition() {
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

    public String toString() {
        return "Competition{" + "id=" + id + ",  nom=" + nom + '}';
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Competition) {
            final Competition other = (Competition) obj;
            return this.id != other.id;
        }
        return false;
    }
}

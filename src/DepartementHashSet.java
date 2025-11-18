import java.util.HashSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        departements.stream()
                .sorted((a, b) -> Integer.compare(a.getId(), b.getId()))
                .forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        departements.stream()
                .sorted((a, b) -> {
                    int cmp = a.getNomDepartement().compareTo(b.getNomDepartement());
                    return (cmp != 0) ? cmp :
                            Integer.compare(a.getNombreEmployes(), b.getNombreEmployes());
                })
                .forEach(System.out::println);
    }
}

public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestion = new DepartementHashSet();

        gestion.ajouterDepartement(new Departement(1, "IT", 40));
        gestion.ajouterDepartement(new Departement(2, "RH", 15));
        gestion.ajouterDepartement(new Departement(3, "Finance", 10));
        gestion.ajouterDepartement(new Departement(5, "Marketing", 20));

        System.out.println("Liste :");
        gestion.afficherDepartements();

        System.out.println("\nRecherche 'RH' : " + gestion.rechercherDepartement("RH"));

        System.out.println("\nTri par id :");
        gestion.trierDepartementsParId();

        System.out.println("\nTri par nom + nb employés :");
        gestion.trierDepartementsParNomEtNombreEmployes();

        System.out.println("\nTest hashCode / doublons :");

        Departement d1 = new Departement(1, "IT", 40);
        Departement d2 = new Departement(1, "IT", 40);

        System.out.println("hash d1 = " + d1.hashCode());
        System.out.println("hash d2 = " + d2.hashCode());

        DepartementHashSet test = new DepartementHashSet();
        test.ajouterDepartement(d1);
        test.ajouterDepartement(d2);

        System.out.println("Affichage (1 seul élément attendu) :");
        test.afficherDepartements();
    }
}

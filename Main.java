public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Création des départements
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Finance", 8);
        Departement dep3 = new Departement(3, "Ressources Humaines", 5);

        // Ajout des départements
        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        // Affichage
        System.out.println("Liste des départements après ajout :");
        gestionDepartements.displayDepartement();

        // Recherche par nom
        System.out.println("\nRecherche d'un département par nom ('Informatique') :");
        System.out.println(gestionDepartements.rechercherDepartement("Informatique"));

        // Recherche par instance
        System.out.println("\nRecherche d'un département par instance (dep2) :");
        System.out.println(gestionDepartements.rechercherDepartement(dep2));

        // Suppression d'un département
        gestionDepartements.supprimerDepartement(dep3);
        System.out.println("\nListe des départements après suppression de 'Ressources Humaines' :");
        gestionDepartements.displayDepartement();

        // Tri par ID
        System.out.println("\nListe triée par ID :");
        for (Departement d : gestionDepartements.trierDepartementById()) {
            System.out.println(d);
        }
    }
}

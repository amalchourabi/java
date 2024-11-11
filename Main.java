public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employe emp1 = new Employe(1, "Ben Ali", "Ahmed", "Informatique", 3);
        Employe emp2 = new Employe(2, "Chakroun", "Sami", "Finance", 2);
        Employe emp3 = new Employe(3, "Trabelsi", "Mounir", "Informatique", 1);
        Employe emp4 = new Employe(4, "Ben Romdhane", "Hana", "Ressources Humaines", 4);
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);
        System.out.println("Liste des employés après ajout :");
        societe.displayEmploye();
        System.out.println("\nRecherche d'un employé par nom (\"Ben Ali\") :");
        System.out.println(societe.rechercherEmploye("Ben Ali"));
        System.out.println("\nRecherche d'un employé par instance (emp1) :");
        System.out.println(societe.rechercherEmploye(emp1));
        societe.supprimerEmploye(emp2);
        System.out.println("\nListe des employés après suppression de Sami Chakroun :");
        societe.displayEmploye();
        System.out.println("Liste triée par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println("\nListe triée par nom de département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
    }
}

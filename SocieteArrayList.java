import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements Gestion<Employe> {
    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // Tri par ID en utilisant Comparable
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // Tri par nom de département et grade en utilisant Comparator
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new EmployeDepartementGradeComparator());
    }
}
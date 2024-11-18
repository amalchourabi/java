import java.util.Comparator;

public class EmployeDepartementGradeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        int departementComparison = e1.getNomDepartement().compareTo(e2.getNomDepartement());
        if (departementComparison != 0) {
            return departementComparison;
        }
        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "feriel", 22));
        students.add(new Student(2, "amin", 20));
        students.add(new Student(3, "amal", 23));

        StudentManagement management = new StudentManagement();

        System.out.println("Tous les étudiants :");
        management.displayStudents(students, System.out::println);

        System.out.println("\nÉtudiants de plus de 21 ans :");
        management.displayStudentsByFilter(students, s -> s.getAge() > 21, System.out::println);

        String names = management.returnStudentsNames(students, Student::getNom);
        System.out.println("\nNoms des étudiants : " + names);

        Student newStudent = management.createStudent(() -> new Student(4, "chayma", 19));
        students.add(newStudent);
        System.out.println("\nAprès l'ajout d'un étudiant :");
        management.displayStudents(students, System.out::println);

        management.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        System.out.println("\nÉtudiants triés par ID :");
        management.displayStudents(students, System.out::println);

        System.out.println("\nAffichage avec un Stream :");
        management.convertToStream(students).forEach(System.out::println);
    }
}

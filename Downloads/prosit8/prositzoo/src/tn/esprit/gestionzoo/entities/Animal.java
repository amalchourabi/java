package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.Exceptions.InvalidAgeException;
//import tn.esprit.gestionzoo.Exceptions.*;

public class Animal {

    protected String family, name;
    protected int age;
    protected boolean isMammal;

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }




    public void afficher_animal() {
        System.out.println("family: " + family);
        System.out.println("Nom: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mammal: " + isMammal);
    }

    public  String toString(){
        return "Animal name: " + name + " family: " + family + " age: " + age + " isMammal: " + isMammal ;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if (age < 0)
            throw new InvalidAgeException("must put a positive number");
         else
            this.age = age;

    }

    public boolean getIsMammal() {
        return isMammal;
    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
}
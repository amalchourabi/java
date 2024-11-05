package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exceptions.ZooFullException;


public class Zoo {
    public static final int nbrCages = 3;
    private Animal[] animals;
    private String name, city;
    private int animalCount = 0;
    private Aquatic[] aquaticAnimals;
    private int nbrAquaAnimal = 0;

    public Zoo() {
        // animals = new Animal[nbrCages];
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
        aquaticAnimals=new Aquatic[10];
    }

    public void addAnimal(Animal animal) throws ZooFullException{
        if (searchAnimal(animal) != -1)
            System.out.println("This animal already exist");
        if (isZooFull()){
            throw new ZooFullException("The Zoo is full");
        }
        animals[animalCount] = animal;
        animalCount++;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }


    public void displayZoo() {
        System.out.println(" Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Maximum Number of Cages: " + this.nbrCages);
    }


    public void show_Animals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null) {
                animals[i].afficher_animal();
                System.out.println("**************");
            }
        }
    }


    @Override
    public String toString() {
        return " Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + nbrCages;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < animalCount; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount] = null;
        this.animalCount--;
        return true;
    }

    public boolean isZooFull() {
        if (animalCount == nbrCages) {
            //System.out.println("Zoo Full");
            return true;
        }
        //System.out.println(" Zoo not Full");
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            System.out.println("zoo have more animals");
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            System.out.println("z2 have more animals");
            return z2;
        } else {
            System.out.println("both have the sme number of animals");
            return z1;
        }
    }

    public void setName(String name){
        if(!name.isEmpty()) {
            this.name = name;
        }
        else System.out.println("Name cannot be empty");
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.animalCount = nbrAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        aquaticAnimals[nbrAquaAnimal] = aquatic;
        nbrAquaAnimal++;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquaAnimal; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (penguin.getSwimmingDepth() > maxDepth)
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrPenguin = 0;
        int nbrDolphin = 0;
        for (int i = 0; i < nbrAquaAnimal; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                nbrPenguin++;
            }
            else if( aquaticAnimals[i] instanceof Dolphin dolphin ){
                nbrDolphin++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphin + " dolphins et " + nbrPenguin + " penguins");
    }

    public int getNbrAquatics() {
        return nbrAquaAnimal;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquaAnimal = nbrAquatics;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }


}
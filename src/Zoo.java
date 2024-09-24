public class Zoo {
    private final int nbrCages = 25; // nbrCages est maintenant une constante
    Animal[] animals;
    String name, city;
    int nbrAnimals = 0;

    Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    boolean addAnimal(Animal animal) {
        if (!isZooFull() && searchAnimal(animal) == -1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    boolean removeAnimal(Animal animal) {
        int deletedIndex = searchAnimal(animal);
        if (deletedIndex != -1) {
            animals[deletedIndex] = null;
            return true;
        }
        return false;
    }

    void displayZoo() {
        System.out.println("name: " + name + " city: " + city + " nbrCages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "name: " + name + " city: " + city + " nbrCages: " + nbrCages + " animals number: " + nbrAnimals;
    }

    void showAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    // Méthode pour vérifier si le zoo est plein
    boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    // Méthode pour comparer deux zoos
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null; // Les deux zoos ont le même nombre d'animaux
        }
    }
}

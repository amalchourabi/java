class Zoo {
    private static final int MAX_ANIMALS = 25;
    private final int NBR_CAGES = 20;
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        setName(name); // Appel du setter pour la validation
        this.city = city;
        this.animals = new Animal[MAX_ANIMALS];
    }


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public Animal[] getAnimals() {
        return animals;
    }


    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Erreur : Le nom du zoo ne doit pas être vide.");
        }
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà dans le zoo.");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
            animalCount--;
            return true;
        }
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }



    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo " + this.name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }



    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getAnimalCount() > z2.getAnimalCount()) {
            return z1;
        } else if (z2.getAnimalCount() > z1.getAnimalCount()) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Zoo: " + name + ", City: " + city + ", Number of animals: " + animalCount + ", Number of cages: " + NBR_CAGES;
    }
}

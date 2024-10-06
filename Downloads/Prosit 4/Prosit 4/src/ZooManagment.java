class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Paris");

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal bear = new Animal("Ursidae", "Bear", 6, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(bear);
        myZoo.addAnimal(elephant);

        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Le zoo a encore de la place.");
        }

        myZoo.displayAnimals();
        System.out.println(myZoo);

        Zoo zoo1 = new Zoo("Zoo A", "Paris");
        Zoo zoo2 = new Zoo("Zoo B", "Lyon");

        // Ajout
        zoo1.addAnimal(new Animal("Felidae", "Lion", 5, true));
        zoo1.addAnimal(new Animal("Ursidae", "Bear", 7, true));

        zoo2.addAnimal(new Animal("Elephantidae", "Elephant", 10, true));
        zoo2.addAnimal(new Animal("Canidae", "Wolf", 4, true));
        zoo2.addAnimal(new Animal("Panthera", "Panther", 6, true));

        // Comparer
        Zoo zooWithMoreAnimals = Zoo.comparerZoo(zoo1, zoo2);

        if (zooWithMoreAnimals != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + zooWithMoreAnimals);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }
    }
}

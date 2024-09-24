public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("family", "simba", 3, true);
        Zoo myZoo = new Zoo("belvidaire", "tunis");
        Animal tiger = new Animal("family", "bagira", 4, true);
        Animal lion2 = new Animal("family", "simba", 3, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(lion2);

        System.out.println(myZoo);
        myZoo.showAnimals();
        System.out.println("Zoo full? " + myZoo.isZooFull()); // Vérifier si le zoo est plein

        Zoo anotherZoo = new Zoo("anotherZoo", "anotherCity");
        anotherZoo.addAnimal(new Animal("family", "panther", 5, true));

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo); // Comparer les deux zoos
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.name);
        }
    }
}

package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating meat.");
        } else {
            System.out.println("This terrestrial animal cannot eat only plants.");
        }
    }

    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT || food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating plants.");
        } else {
            System.out.println("This terrestrial animal cannot eat only meat.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("This terrestrial animal needs both plants and meat.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nnbrLegs: " + nbrLegs;
    }
}

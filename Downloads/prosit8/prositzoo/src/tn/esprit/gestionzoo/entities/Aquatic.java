package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal implements Carnivore <Food>{
    protected String habitat;

    public Aquatic(){
    }

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("This aquatic animal is eating meat.");
        } else {
            System.out.println("This aquatic animal only eats meat.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nhabitat: " + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (obj instanceof Aquatic aquatic){
            return age == aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat) ;
        }
        return false;
    }

}

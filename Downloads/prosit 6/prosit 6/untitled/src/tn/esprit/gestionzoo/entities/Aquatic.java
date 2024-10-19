package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends animal {
    String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return (super.toString()+" habitat: "+habitat);
    }
    public abstract void swim();
    public boolean equals(Aquatic aquatic) {
        if(this.getName()==aquatic.getName()&&this.getAge()==aquatic.getAge()&&this.getHabitat()==aquatic.getHabitat()){
            return true;
        }else {
            return false;
        }
    }
}

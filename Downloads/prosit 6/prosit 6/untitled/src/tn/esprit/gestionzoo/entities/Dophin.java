package tn.esprit.gestionzoo.entities;

public class Dophin extends Aquatic{
    float swimingSpeed;

    public Dophin(String family, String name, int age, boolean isMammal, String habitat, float swimingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimingSpeed = swimingSpeed;
    }

    @Override
    public String toString() {
         return (super.toString()+" swimingSpeed: "+swimingSpeed);
    }
    public void swim(){
        System.out.println("this dolphin is swimming");
    }
}

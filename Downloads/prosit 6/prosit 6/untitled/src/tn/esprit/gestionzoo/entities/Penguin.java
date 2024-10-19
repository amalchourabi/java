package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    float swimmingDeptth;

    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDeptth) {
        super(family, name, age, isMammal,habitat);
        this.swimmingDeptth = swimmingDeptth;
    }

    @Override
    public String toString() {
        return (super.toString()+" swimmingDeptth: "+swimmingDeptth);
    }

    @Override
    public void swim() {

    }

    public float getSwimmingDeptth() {
        return swimmingDeptth;
    }

    public void setSwimmingDeptth(float swimmingDeptth) {
        this.swimmingDeptth = swimmingDeptth;
    }
}

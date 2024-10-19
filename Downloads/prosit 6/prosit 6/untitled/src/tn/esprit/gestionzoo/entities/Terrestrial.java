package tn.esprit.gestionzoo.entities;

public class Terrestrial extends animal{
    int nbrLegs;

    public Terrestrial(int nbrLegs,String family, String name , int age , boolean isMammal){
        super( family, name , age , isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return (super.toString()+" nbrLegs: "+nbrLegs);
    }
}

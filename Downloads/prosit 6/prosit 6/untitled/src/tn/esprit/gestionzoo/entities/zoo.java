package tn.esprit.gestionzoo.entities;

public class zoo {
    private  animal[]animals ;
    private   String name;
    private  String city;
    private final int nbrCages =25;
    private int nbrAnimals = 0;
    public Aquatic [] aquaticAnimals = new Aquatic[10];

    public zoo(String name, String city) {
        animals=new animal[nbrCages];
        this.name = name;
        this.city = city;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }
    public void displayAllAquaticSwim() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxDepth=0;
        for(Aquatic aquatic : aquaticAnimals){
            if(aquatic instanceof Penguin&& ((Penguin) aquatic).getSwimmingDeptth()>maxDepth){
                maxDepth=((Penguin) aquatic).getSwimmingDeptth();
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nbrDophin=0;
        int nbrPenguin=0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                nbrPenguin++;
            } else if (aquatic instanceof Dophin) {
                nbrDophin++;
            }
        }
        System.out.println("nombre de Dophin : "+nbrDophin+" et nombre de penguin est : "+nbrPenguin);
    }
    public void display(){
        System.out.println(name + " " + city + " " + nbrCages);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.zoo name :"+name+" city:"+city+" nbrCages:"+nbrCages;
    }
    public boolean addAnimal(animal animal){
        if(searchAnimal(animal.getName())==-1&&!isZooFUll()){
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            return true;
        }else{
            return false;
        }

    }
    public void getAllAnimals(){
        for(animal a:animals){
            System.out.println(a);
        }
    }
    public int searchAnimal(String name){
        for(int i=0;i<nbrAnimals;i++){
            if(animals[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(animal animal){
        if(searchAnimal(animal.getName())!=-1) {
            int deleteInt = searchAnimal(animal.getName());
            animals[deleteInt] = null;
            nbrAnimals--;
        }
        return true;
    }
    public boolean isZooFUll(){
        if(nbrAnimals<nbrCages){
            return false;
        }else {
            return true;
        }
    }
    public zoo comparerZoo(zoo z1,zoo z2){
        if(z1.nbrAnimals>z2.nbrAnimals){

            return z1;
        }else {

            return z2;
        }
    }

    public animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("")) {
            this.name = name;
        }else{
            System.out.println("invalid name");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
}

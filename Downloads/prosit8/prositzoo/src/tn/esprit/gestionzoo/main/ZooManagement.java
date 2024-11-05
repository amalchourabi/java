package tn.esprit.gestionzoo.main;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import tn.esprit.gestionzoo.entities.*;
import  tn.esprit.gestionzoo.Exceptions.*;

class ZooManagement {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



            /*
            prosit 1:
            System.out.println("Enter tn.esprit.gestionzoo.entities.zoo name");
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.println("Enter tn.esprit.gestionzoo.entities.zoo name:");
            zooName = myObj.nextLine();
        } while (!(zooName instanceof String) || zooName.trim().isEmpty());


        boolean isNumber=false;
        System.out.println("Enter nbre cages");
        do {
            if (myObj.hasNextInt()) {

                isNumber=true;
            } else {
                System.out.println("please type a number");
            }
            String nbrCages = myObj.nextLine();
        }while (!isNumber);
        System.out.println("Enter nom de tn.esprit.gestionzoo.entities.zoo");
        System.out.print(zooName+" comporte "+nbrCages);

*/
        /* intruction 5 :
        tn.esprit.gestionzoo.entities.animal lion = new tn.esprit.gestionzoo.entities.animal ();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;*/
        //intruction 6 : le travail par construceur est plus facile
        //intruction 8 :lorsque on utilise Sos(myzoo) et Sos(myzoo.toString) on remarque affichage de @ memoire
        Zoo myzoo=new Zoo("myzoo","tunis");
        Animal lion =new Animal("cat","lion",4,true);
        Animal el=new Animal("7ayawan","fil",4,true);
        Animal dog=new Animal("dog","dog",4,true);
        Animal cat=new Animal("cat","cat",4,true);
        System.out.println("tn.esprit.gestionzoo.entities.zoo name :"+myzoo.getName()+" city:"+myzoo.getCity()+" nbrCages:"+myzoo.getNbrCages());
        System.out.println(myzoo.toString());
        myzoo.displayZoo();
        /*System.out.println(lion);
        System.out.println("tn.esprit.gestionzoo.entities.animal name :"+lion.name +" age :"+lion.age +" isMammal :"+lion.isMammal);
        System.out.println(lion.toString());*/
        try {
            myzoo.addAnimal(el);
            myzoo.addAnimal(dog);

        }catch (ZooFullException e){
            System.out.println(e.getMessage());
        }

        System.out.println(myzoo.getAnimalCount());
        myzoo.removeAnimal(el);
        System.out.println(myzoo.getAnimalCount());
        myzoo.getAnimals();
        Zoo bel=new Zoo("belvidere","tunis");
        Animal dhib=new Animal("dhib","dhib",4,true);
        Animal karkadan=new Animal("7ayawan","3antar",4,true);
        Animal kalb=new Animal("dog","blancge neige",4,true);
        Animal gatoous=new Animal("cat","7bicha",4,true);
        Animal snoop= new Animal("fakroun","snoopturtle",4 ,true );
        Animal alinejma = new Animal("thoour","alinejma",4,true);
        try {
            bel.addAnimal(snoop);
            bel.addAnimal(kalb);
            bel.addAnimal(dhib);
        }

        catch (ZooFullException e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            System.out.println("aa");
        }
        System.out.println(bel.comparerZoo(bel,myzoo));
        Animal a= new Animal("test","test",4,true);

        Terrestrial ter = new Terrestrial("ka2en yemchi","a",4,true,2);
        Dolphin dophin = new Dolphin("dophin","flipper",2,true,"b7ar",150);
        Penguin penguin = new Penguin("pingo-it","skipper",3,true,"blassa barda",15);
        Dolphin del = new Dolphin("dophin","flipper",2,true,"b7ar",150);
        System.out.println(a.toString());
        Terrestrial winnie = new Terrestrial("dabdoub","winnie",4,true,2);

        System.out.println(ter.toString());
        System.out.println(dophin.toString());
        System.out.println(penguin.toString());
        dophin.swim();

        bel.addAquaticAnimal(dophin);
        bel.addAquaticAnimal(del);
        bel.addAquaticAnimal(penguin);
        bel.displayNumberOfAquaticsByType();
        System.out.println(del.equals(dophin));
        dophin.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.MEAT);
        winnie.eatMeat(Food.MEAT);
        winnie.eatPlant(Food.PLANT);
        winnie.eatPlantAndMeat(Food.BOTH);
    }
}
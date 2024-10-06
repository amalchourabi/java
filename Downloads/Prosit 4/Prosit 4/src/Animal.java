class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }


    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Erreur : L'âge d'un animal ne peut pas être négatif.");
        }
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }


    public String toString() {
        return "Animal [Family=" + family + ", Name=" + name + ", Age=" + age + ", IsMammal=" + isMammal + "]";
    }
}

public class Animal {
    private String nom;
    private int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void manger() {
        System.out.println("L'animal mange de la nourriture.");
    }

    public void seDéplacer() {
        System.out.println("L'animal se déplace.");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", age=" + age;
    }
}

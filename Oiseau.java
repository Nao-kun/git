public class Oiseau extends Animal {
    private String typePlumage;

    public Oiseau(String nom, int age, String typePlumage) {
        super(nom, age);
        this.typePlumage = typePlumage;
    }

    public void voler() {
        System.out.println("L'oiseau vole dans le ciel.");
    }

    public String getTypePlumage() {
        return typePlumage;
    }

    public void setTypePlumage(String typePlumage) {
        this.typePlumage = typePlumage;
    }

    @Override
    public String toString() {
        return super.toString() + ", typePlumage=" + typePlumage;
    }
}

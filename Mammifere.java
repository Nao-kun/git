public class Mammifere extends Animal {
    private String typeFourrure;

    public Mammifere(String nom, int age, String typeFourrure) {
        super(nom, age);
        this.typeFourrure = typeFourrure;
    }

    public void allaiter() {
        System.out.println("La femelle mammifère allaite ses petits.");
    }

    public String getTypeFourrure() {
        return typeFourrure;
    }

    public void setTypeFourrure(String typeFourrure) {
        this.typeFourrure = typeFourrure;
    }

    @Override
    public String toString() {
        return super.toString() + ", typeFourrure=" + typeFourrure;
    }
}
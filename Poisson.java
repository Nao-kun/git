public class Poisson extends Animal {
    private String typeEcailles;

    public Poisson(String nom, int age, String typeEcailles) {
        super(nom, age);
        this.typeEcailles = typeEcailles;
    }

    public void nager() {
        System.out.println("Le poisson nage dans l'eau.");
    }

    public String getTypeEcailles() {
        return typeEcailles;
    }

    public void setTypeEcailles(String typeEcailles) {
        this.typeEcailles = typeEcailles;
    }

    @Override
    public String toString() {
        return super.toString() + ", typeEcailles=" + typeEcailles;
    }
}
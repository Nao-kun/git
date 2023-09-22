public class Reptile extends Animal {
    private boolean sangFroid;

    public Reptile(String nom, int age, boolean sangFroid) {
        super(nom, age);
        this.sangFroid = sangFroid;
    }

    public void seChaufferAuSoleil() {
        System.out.println("Le reptile se chauffe au soleil pour réguler sa température corporelle.");
    }

    public boolean isSangFroid() {
        return sangFroid;
    }

    public void setSangFroid(boolean sangFroid) {
        this.sangFroid = sangFroid;
    }

    @Override
    public String toString() {
        return super.toString() + ", sangFroid=" + sangFroid;
    }
}
public class Oiseau {
    private String nom;
    private int age;
    private boolean vol;

    public Oiseau() {
    }

    public Oiseau(String nom, int age, boolean vol) {
        this.nom = nom;
        this.age = age;
        this.vol = vol;
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

    public boolean isVol() {
        return vol;
    }

    public void setVol(boolean vol) {
        this.vol = vol;
    }

}

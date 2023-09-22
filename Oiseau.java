public class Oiseau extends Animal {
    private boolean vol;

    public Oiseau() {
    }

    public Oiseau(String nom, int age, boolean vol) {
        super(nom, age);
        this.vol = vol;
    }

    public boolean isVol() {
        return vol;
    }

    public void setVol(boolean vol) {
        this.vol = vol;
    }

}

public class Automobil extends Vozila {

    private  double brojVrata;

    public Automobil(String marka, double brzina, double brojVrata){
        super(marka, brzina);
        this.brojVrata = brojVrata;
    }

    public double getBrojVrata() {
        return brojVrata;
    }

    void setBrojVrata(double brojVrata) {
        this.brojVrata = brojVrata;
    }
}

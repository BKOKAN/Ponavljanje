public class Automobil implements Ubrzanje {
    private String marka;
    private double brzina;
    private  double brojVrata;

    public Automobil(String marka, double brzina, double brojVrata){
        this.marka = marka;
        this.brzina = brzina;
        this.brojVrata = brojVrata;
    }
    public String getMarka(){
        return this.marka;
    }

    public double getBrojVrata() {
        return brojVrata;
    }

    public double getBrzina() {
        return brzina;
    }

    public void setBrojVrata(double brojVrata) {
        this.brojVrata = brojVrata;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }
    @Override
    public void ubrzanje(double iznos){
        this.brzina += iznos;
    }
}

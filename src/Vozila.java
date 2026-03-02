public class Vozila implements Ubrzanje {
    String marka;
    Double brzina;
    public Vozila(String marka, Double brzina){
        this.marka = marka;
        this.brzina = brzina;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Double getBrzina() {
        return brzina;
    }

    public void setBrzina(Double brzina) {
        this.brzina = brzina;
    }

    @Override
    public void ubrzanje(double iznos){
        this.brzina += iznos;
    };
}

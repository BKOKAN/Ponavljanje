public class Motocikl implements Ubrzanje {
        private String marka;
        private double brzina;
        private String tip;

        public Motocikl(String marka, double brzina, String tip){
            this.marka = marka;
            this.brzina = brzina;
            this.tip = tip;
        }
        public String getMarka(){
            return this.marka;
        }

        public String getTip() {
            return tip;
        }

        public double getBrzina() {
            return brzina;
        }

        public void setTip(String tip) {
            this.tip = tip;
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


public class Motocikl extends Vozila {

        private String tip;

        public Motocikl(String marka, double brzina, String tip){
            super(marka,brzina);
            this.tip = tip;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }
    }


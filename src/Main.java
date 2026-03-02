 public class Main {
    public static void main(String[] args) {
        Automobil a1 = new Automobil("BMW", 120, 4);
        Automobil a2 = new Automobil("Golf", 80, 2);

        Motocikl m1 = new Motocikl("Kawasaki", 150, "sport");
        Motocikl m2 = new Motocikl("Vespa", 60, "skuter");

        Vozila[] vozila = {a1, a2, m1, m2};

        for (Vozila v : vozila) {
            v.ubrzanje(15);
            System.out.println(v.getMarka() + " -> " + v.getBrzina());
        }

    }
}

 public class Main {
    public static void main(String[] args) {
        Automobil a1 = new Automobil("BMW", 120, 4);
        Automobil a2 = new Automobil("Golf", 80, 2);

        Motocikl m1 = new Motocikl("Kawasaki", 150, "sport");
        Motocikl m2 = new Motocikl("Vespa", 60, "skuter");

        Ubrzanje[] vozila = {a1, a2, m1, m2};
        for (Ubrzanje v : vozila) {
            v.ubrzanje(15);
        }

        System.out.println(a1.getBrzina());
        System.out.println(a2.getBrzina());
        System.out.println(m1.getBrzina());
        System.out.println(m2.getBrzina());
    }
}

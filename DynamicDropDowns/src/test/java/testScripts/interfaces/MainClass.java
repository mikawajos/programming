package testScripts.interfaces;

public class MainClass {

    public static void main(String[] args) {
        Raporty r = new Raporty();

        r.tytul = "BLABLABL";
        r.generateRaport(r.tytul);
        System.out.println(r.generatedBy("Marcin"));
        r.show(r.tytul);
        r.drukuj(r.tytul);
        System.out.println(r.deleteRaport(r.tytul));
    }
}

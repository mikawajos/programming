
package testScripts.interfaces;
public class Raporty extends Raport implements RaportyInterface{
    String tytul;


    @Override
    public void show(String str){
        System.out.println("Raport " + str + " wyswietlany na ekranie ");
    }

    @Override
    public void drukuj(String str){
        System.out.println("Drukowanie raportu " + str);
    }

    @Override
    public String deleteRaport(String str) {
        return "Deleting report " + str + " usuniety z systemu";
    }

    @Override
    public void generateRaport(String str) {
        System.out.println("Pzygotowywanei raportu " + str);
    }
}

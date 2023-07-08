package genel;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static  void main(String[] args) {
        Manager manager1=new Manager("muster","W",101,55, 4000);
        manager1.setDescription("Personal Abteilung");
        manager1.setExtra("Erstellt für diese Woche einen Plan, neu Project zu erledigen");

        Praktikant neuGuy=new Praktikant("Neu","W",25,22.4 );

        manager1.printAll();
        neuGuy.printAll();

    }
}
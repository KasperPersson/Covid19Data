import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> covidListe = fh.loadAllData();

for (Covid19Data covid : covidListe) {
    System.out.println(covid);
}
    }
}

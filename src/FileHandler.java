import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File file = new File("Covid19Data.csv");

    public ArrayList<Covid19Data> loadAllData() {
        ArrayList<Covid19Data> covidListe = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file, StandardCharsets.ISO_8859_1);
            scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Covid19Data covid = null;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] attributes = line.split(";");
            covid = new Covid19Data(attributes[0], attributes[1], (Integer.parseInt(attributes[2])), (Integer.parseInt(attributes[3])), (Integer.parseInt(attributes[4])),
                    (Integer.parseInt(attributes[5])), attributes[6]
            );
            covidListe.add(covid);
        }
        scanner.close();
        return covidListe;
    }
}

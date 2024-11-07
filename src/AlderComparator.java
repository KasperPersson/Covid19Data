import java.util.Comparator;

public class AlderComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data alder1, Covid19Data alder2) {
        return alder1.getAldersgruppe().compareTo(alder2.getAldersgruppe());
    }
}

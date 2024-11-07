import java.util.Comparator;

public class TilfældeComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data tilfælde1, Covid19Data tilfælde2) {
        return tilfælde1.getTilfælde() - tilfælde2.getTilfælde();
    }
}

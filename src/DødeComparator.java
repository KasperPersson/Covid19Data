import java.util.Comparator;

public class DødeComparator implements Comparator<Covid19Data> {

    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        return o1.getDøde() - o2.getDøde();
    }
}

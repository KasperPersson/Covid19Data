import java.util.*;

public class UserInterface {
    private FileHandler fileHandler;
    private ArrayList<Covid19Data> data;

    public UserInterface() {
        fileHandler = new FileHandler();
        data = fileHandler.loadAllData();
    }

    //TODO LAV EN SWITCH MED 2 MULIGHEDER OG KLISTRER COMPARATORS SAMMEN.

    public void Start() {
        System.out.println("Velkommen til Covid19 data");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\npress:\n" +
                    "1. for sorting by region\n" +
                    "2. for sorting by aldersgruppe\n" +
                    "3. Afslut programmet");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Comparator<Covid19Data> comp1 = new RegionComparator().thenComparing(new AlderComparator()
                            .thenComparing(new TilfældeComparator()).thenComparing(new IndlagteComparator()
                                    .thenComparing(new IntensivComparator()
                                            .thenComparing(new DødeComparator()))));
                    Collections.sort(data, comp1);
                    System.out.println("Data sorteret efter Region og derefter aldersgruppe");
                    for (Covid19Data covidliste : data) {
                        System.out.println(covidliste);
                    }
                    break;

                case 2:
                    Comparator<Covid19Data> comp2 = new AlderComparator().thenComparing(new RegionComparator());
                    Collections.sort(data, comp2);
                    System.out.println("Data sorteret efter aldersgruppe og derefter region");
                    for (Covid19Data covidliste : data) {
                        System.out.println(covidliste);
                    }
                    break;
                case 3:
                    System.out.println("Afslutter programmet");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ugyldigt. Prøv igen.");
            }


//            switch (choice) {
//                case 1:
//                    sortDataByRegion();
//                    printData();
//                    break;
//                case 2:
//                    sortDataByAldersGruppe();
//                    printData();
//                    break;
//                case 3:
//                    System.out.println("Afslutter programmet.");
//                    scanner.close();
//                    return;
//                default:
//                    System.out.println("Ugyldigt valg, prøv igen.");
//            }
//        }
//    }
//
//    private void sortDataByRegion() {
//        Collections.sort(data, new RegionComparator());
//        System.out.println("Data sorteret efter region.");
//    }
//
//    private void sortDataByAldersGruppe() {
//        Collections.sort(data, new AlderComparator());
//        System.out.println("Data sorteret efter aldersgruppe.");
//    }
//
//    private void printData() {
//        for (Covid19Data d : data) {
//            System.out.println(d);
//        }
//    }
        }
    }
}

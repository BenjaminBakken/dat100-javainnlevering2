package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        System.out.print("["); // Printer start av tabell før første element

        for (int i = 0; i < tabell.length; i++) {

            if (i > 0) {
                System.out.print(", "); // Printer mellomrom mellom element før alle andre element enn det første elementet
            }
            System.out.print(tabell[i]); // Printer selve elementet
        }
        System.out.println("]"); // Printer slutt av tabell etter siste element
    }

    // b)
    public static String tilStreng(int[] tabell) {

        String tabellInnhold = "[";

        for (int i = 0; i < tabell.length; i++) {

            if (i > 0) {
                tabellInnhold += ","; // Legger til mellomrom mellom element før alle andre element enn det første elementet i strengen
            }
            tabellInnhold += Integer.toString(tabell[i]); // Legger til selve elementet i strengen
        }
        tabellInnhold += "]";
        return tabellInnhold;
    }

    // c)
    public static int summer(int[] tabell) {

        int sum = 0;

        for (int i : tabell) {

            sum += i; // Legger til verdi av hvert element til totalsum av alle elementer
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        boolean svar = false;

        for (int i : tabell) {

            if (i == tall) { // Sjekker element mot input-tall og endrer svar til true dersom de er like
                svar = true;
                break;
            }

        }
        return svar;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        int posisjon = -1; // Variabel til posisjon, initialiserer til -1 som blir returverdi dersom tall ikke funnet.

        for (int i = 0; i < tabell.length; i++) {

            if (tabell[i] == tall) { // Leter etter input-tall i tabell, lagrer posisjonen evt. tall er funnet i,
                posisjon = i;        // og hopper ut av løkke.
                break;
            }
        }
        return posisjon;
    }

    // f)
    public static int[] reverser(int[] tabell) {

        int lengde = tabell.length; // Variabel for tabell-lengde for å unngå å gjenta metodekall flere ganger.
        int[] reversTabell = new int[lengde]; // Tabell for å putte inn verdier i motsatt rekkefølge.

        for (int i = 0; i < lengde; i++) {

            reversTabell[lengde - 1 - i] = tabell[i]; // Begynner på siste posisjon i reversTabell, iterer bakover
        }                                             // og setter inn verdier fra tabell i motsatt rekkefølge
        return reversTabell;
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        boolean sortert = true; // Variabel for om tabell er sortert. Starter med true, og endres ved moteksempel.

        for (int i = 0; i < tabell.length - 1; i++) {

            if (tabell[i] > tabell[i + 1]) { // Setter sortert-variabel til false dersom et element i tabellen er større
                sortert = false;           // enn elementet etter. Vil stoppe iterasjon på nest siste plass for å unngå
                break;                     // å gå out-of-bounds.
            }
        }
        return sortert;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        // Variabel for ny tabell, med lengde lik summen av lengden av input-tabeller
        int[] nyTabell = new int[tabell1.length + tabell2.length];
        int indeks = 0; // Variabel for å holde telling på indeks i ny tabell.

        // To for-løkker for å iterere gjennom og sette inn verdiene fra hver tabell
        for (int i : tabell1) {
            nyTabell[indeks] = i;
            indeks++;
        }
        for (int j : tabell2) {
            nyTabell[indeks] = j;
            indeks++;
        }
        return nyTabell;

    }
}

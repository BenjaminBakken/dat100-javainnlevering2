package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        for (int[] rad : matrise) {       // Itererer gjennom rader i matrise
            for (int element : rad) {     // Itererer gjennom elementer i rad
                System.out.print(element + " "); // Skriver ut element og mellomrom
            }
            System.out.println(); // Linjeskifte
        }
        System.out.println(); // Ekstra linjeskifte for å skille flere matriser
    }

    // b)
    public static String tilStreng(int[][] matrise) {

        String matriseStreng = ""; // Oppretter tom strengvariabel for å legge til elementer fra matrise.
        for (int[] rad : matrise) { // Itererer gjennom rader i matrise
            for (int element : rad) {     // Itererer gjennom elementer i rad
                matriseStreng += element + " "; // Legger til element og mellomrom til streng
            }
            matriseStreng += "\n"; // Legger til linjeskifte til streng
        }
        return matriseStreng;

    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        // Variabler for antall rader og antall kolonner i matrise. Siden det er en matrise, kan jeg anta at alle rader
        // vil være like lange som den første (matrise[0].length), som vil gi antall kolonner.
        int rader = matrise.length;
        int kolonner = matrise[0].length;
        // Matrise til å lagre produktene av input-tall og verdiene i input-matrise
        int[][] skalertMatrise = new int[rader][kolonner];

        for (int rad = 0; rad < rader; rad++) { // Itererer gjennom rader i matrise
            for (int kolonne = 0; kolonne < kolonner; kolonne++) { // Itererer gjennom elementer i rad

                skalertMatrise[rad][kolonne] = matrise[rad][kolonne] * tall; // Produkt av input-tall og verdi i matrise
            }
        }
        return skalertMatrise;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        // Bruker forskjellige betingelsesuttrykk til å sjekke om matrisene er ulike, og vil returnere "false" med en
        // gang ulikhet er funnet. Når alt er sjekket og ingen ulikheter er funnet, vil metoden returnere "true".

        if (a.length != b.length) { // Sjekker om det er like mange rader i matrisene
            return false;
        }
        if (a[0].length != b[0].length) { // Sjekker om det er like mange kolonner i matrisene
            return false;
        }
        for (int rad = 0; rad < a.length; rad++) { // Sjekker hvert element i matrisene mot hverandre
            for (int kolonne = 0; kolonne < a[0].length; kolonne++) {
                if (a[rad][kolonne] != b[rad][kolonne]) {
                    return false;
                }
            }
        }
        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        // Variabler for antall rader og antall kolonner i matrise. Siden det er en matrise, kan jeg anta at alle rader
        // vil være like lange som den første (matrise[0].length), som vil gi antall kolonner.
        int rader = matrise.length;
        int kolonner = matrise[0].length;
        int[][] speilMatrise = new int[rader][kolonner]; // Variabel for speilet matrise av input

        for (int rad = 0; rad < rader; rad++) { // Itererer gjennom rader i matrise
            for (int kolonne = 0; kolonne < kolonner; kolonne++) { // Itererer gjennom elementer i rad

                // For å speile matrisen legger vi inn verdien fra kolonneplassens tilsvarende radplass og radplassens
                // tilsvarende kolonneplass. Eksempel: Verdi i rad 2 - kolonne 4, blir lagt i rad 4 - kolonne 2 i ny matrise.
                speilMatrise[rad][kolonne] = matrise[kolonne][rad];
            }
        }
        return speilMatrise;

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        int aRader = a.length, aKolonner = a[0].length; // Antall rader og kolonner i matrise a
        int bRader = b.length, bKolonner = b[0].length; // Antall rader og kolonner i matrise b

        // Variabel for matrisen som er produktet av a og b, definert med like mange rader som a og kolonner som b
        int[][] produktMatrise = new int[aRader][bKolonner];

        if (bRader != aKolonner) { // Sjekker om matriser kan multipliseres (antall kolonner i a må vere lik rader i b)
            // Printer feilmelding og stopper metoden ved å returnere tom matrise.
            System.out.print("Kan ikke multiplisere matriser. Antall kolonner i første matrise må være lik rader i andre matrise");
            return produktMatrise;
        }
        // Itererer gjennom rader og kolonner i produktMatrise (like mange rader som a og kolonner som b).
        for (int r = 0; r < aRader; r++) {
            for (int k = 0; k < bKolonner; k++) { // r = valgt rad, k = valgt kolonne

                // Where the magic happens: Oppretter variabler 'i' for å telle gjennom kolonner i matrise a, og 'j' for
                // å telle gjennom rader i matrise b. Produktet av element i matrise a og speilet element i
                // matrise b blir lagt til totalsummen som skal bli nytt element i gitt rad og kolonne i ny matrise.
                for (int i = 0, j = 0; i < aKolonner && j < bRader; i++, j++) {

                    produktMatrise[r][k] += a[r][i] * b[j][k];
                }
            }
        }
        return produktMatrise;
    }
}

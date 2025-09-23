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
        int radNr = matrise.length;
        int kolonneNr = matrise[0].length;
        // Matrise til å lagre produktene av input-tall og verdiene i input-matrise
        int[][] skalertMatrise = new int[radNr][kolonneNr];

        for (int rad = 0; rad < radNr; rad++) { // Itererer gjennom rader i matrise
            for (int kolonne = 0; kolonne < kolonneNr; kolonne++) { // Itererer gjennom elementer i rad

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
        int radNr = matrise.length;
        int kolonneNr = matrise[0].length;
        int[][] speilMatrise = new int[radNr][kolonneNr]; // Variabel for speilet matrise av input

        for (int rad = 0; rad < radNr; rad++) { // Itererer gjennom rader i matrise
            for (int kolonne = 0; kolonne < kolonneNr; kolonne++) { // Itererer gjennom elementer i rad

                // For å speile matrisen legger vi inn verdien fra kolonneplassens tilsvarende radplass og radplassens
                // tilsvarende kolonneplass. Eksempel: Verdi i rad 2 - kolonne 4, blir lagt i rad 4 - kolonne 2 i ny matrise.
                speilMatrise[rad][kolonne] = matrise[kolonne][rad];
            }
        }
        return speilMatrise;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}

package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        System.out.print("["); // Printer start av tabell før første element
		for (int i = 0; i < tabell.length; i++) { // Itererer gjennom tabell

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
        for (int i = 0; i < tabell.length; i++) { // Itererer gjennom tabell

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
        for (int i : tabell) { // Itererer gjennom tabell

            sum += i; // Legger til verdi av hvert element til totalsum av alle elementer
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean svar = false;
        for (int i : tabell) { // Itererer gjennom tabell

            if (i == tall) { // Sjekker element mot input-tall og endrer svar til true dersom de er like
                svar = true;
                break;
            }

        }
        return svar;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int posisjon = -1;
        for (int i = 0; i < tabell.length; i++) { // Itererer gjennom tabell

            if (tabell[i] == tall) {
                posisjon = i;
            }
        }
        return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}

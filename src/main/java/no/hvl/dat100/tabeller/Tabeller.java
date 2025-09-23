package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) { // Itererer gjennom tabell

            if (i == 0) {
                System.out.print("["); // Printer start av tabell før første element.
            }
            if (i > 0) {
                System.out.print(", "); // Printer mellomrom mellom element før alle andre element enn det første elementet.
            }
            System.out.print(tabell[i]); // Printer selve elementet.
            if (i == tabell.length - 1) {
                System.out.println("]"); // Printer slutt av tabell etter siste element.
            }
        }

	}

	// b)
	public static String tilStreng(int[] tabell) {

        String tabellInnhold = "";
        for (int i = 0; i < tabell.length; i++) { // Itererer gjennom tabell

            if (i == 0) {
                tabellInnhold += "["; // Legger til start av tabell før første element i strengen.
            }
            if (i > 0) {
                tabellInnhold += ","; // Legger til mellomrom mellom element før alle andre element enn det første elementet i strengen.
            }
            tabellInnhold += Integer.toString(tabell[i]); // Legger til selve elementet i strengen.
            if (i == tabell.length - 1) {
                tabellInnhold += "]"; // Printer slutt av tabell etter siste element.
            }
        }
        return tabellInnhold;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
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

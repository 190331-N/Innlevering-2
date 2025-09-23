package no.hvl.dat100.tabeller;

public class Tabeller {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        skrivUt(tab);
        System.out.println();
        summer(tab);
    }

    // a)
    public static void skrivUt(int[] tabell) {
        for (int tab : tabell) {
            System.out.print(tab+", ");

        }
    }

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {
        int sum=0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        System.out.print(sum);
        return sum;

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

package no.hvl.dat100.tabeller;

public class Tabeller {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        skrivUt(tab);
        skrivUt(tab1);
    }

    // a)
    public static void skrivUt(int[] tabell) {
        for (int tab : tabell) {
            System.out.println(tab);


        }
    }

	// b)
	public static String tilStreng(int[] tabell) {
        string[] tab1 = {42,67,89};


	}
/*
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
	*/
}

import java.util.Arrays;
package no.hvl.dat100.tabeller;


public class Tabeller {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        skrivUt(tab);
        System.out.println();
        summer(tab);
        System.out.println();
        System.out.print(finnesTall(tab, 5));
        System.out.println();

    }


    // a)
    public static void skrivUt(int[] tabell) {
        for (int tab : tabell) {
            System.out.print(tab+", ");
        }
    }

	// b)
	public static String tilStreng(int[] tabell) {
            for (int t : tabell) {
                System.out.print(t + " ");
            }
            System.out.println();
            }
        }


	}

	// c)
	public static int summer(int[] tabell) {
        int sum=0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        System.out.println(sum);
        return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

        boolean tf = false;
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]){
                tf = true;
            }
        }
        return tf;
	}

    /*

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
*/
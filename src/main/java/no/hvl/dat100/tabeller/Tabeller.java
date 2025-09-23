package no.hvl.dat100.tabeller;
import java.util.Arrays;

public class Tabeller {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        skrivUt(tab);
        System.out.println();

        System.out.print(tilStreng(tab));
        System.out.println();

        summer(tab);

        System.out.print(finnesTall(tab, 5));
        System.out.println();

        System.out.println(posisjonTall(tab,4));
        System.out.println();

        System.out.println(Arrays.toString(reverser(tab)));

        System.out.print(erSortert(tab));
        System.out.println();
    }


    // a)
    public static void skrivUt(int[] tabell) {
        for (int tab : tabell) {
            System.out.print(tab + ", ");
        }
    }

    // b)
    public static String tilStreng(int[] tab) {
        return Arrays.toString(tab).replace(" ", "");

    }


    // c)
    public static int summer(int[] tabell) {
        int sum = 0;
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
            if (tall == tabell[i]) {
                tf = true;
            }
        }
        return tf;
    }


    // e)
    public static int posisjonTall(int[] tabell, int tall) {
        int t = -1;
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]){
                t=i;
            }
        }
        return t;

    }

    // f)
    public static int[] reverser(int[] tabell) {
        int i = 0;
        int l = tabell.length;
        int[] nyTabell = new int[l];
        for (i = 0; i < tabell.length; i++) {
            nyTabell[i]=tabell[l-1-i];
        }
        return nyTabell;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        for(int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;

    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        // TODO
        throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

    }

}

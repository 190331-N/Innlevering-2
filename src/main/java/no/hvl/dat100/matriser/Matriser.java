package no.hvl.dat100.matriser;

public class Matriser {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        skrivUt(mat);
        System.out.println(tilStreng(mat));
        int[][] nyMat = skaler(2, mat);
        skrivUt(nyMat);
        System.out.println();
        System.out.print(erLik(mat, nyMat));
    }

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int element : rad) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {
        String resultat = "";
        for (int[] rad : matrise) {
            for (int element : rad) {
                resultat = resultat + element + " ";

            }
            resultat += "\n";

        }
        return resultat;

    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMat = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                nyMat[i][j] = tall * matrise[i][j];
            }
        }
        return nyMat;
    }


    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        boolean x = true;

        if (a.length != b.length) {
            x = false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                x = false;
            }

            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    x = false;
                }
            }
        }
        return x;
    }
}

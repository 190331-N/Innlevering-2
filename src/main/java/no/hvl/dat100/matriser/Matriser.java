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
        int[][] nyMat = skaler(2,mat);
        skrivUt(nyMat);
    }

	// a)
	public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for(int element : rad){
                System.out.print(element+" ");
            }
            System.out.println();

        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        String resultat = "";
            for (int[] rad : matrise) {
                for(int element : rad){
                    resultat = resultat + element+" ";

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

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}

package algoritmidiricerca;

import java.util.Scanner;

public class algoritmiDiRicerca {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] v = {1, 2, 5, 7, 9, 12, 14, 17, 20, 21, 25, 28};
        System.out.println("Inserisci il numero da cercare");
        int n = in.nextInt();
        System.out.println(ricerca(v, n));

    }

    public static boolean ricerca(int[] v, int n) {
        int ind = 0;
        int con = v.length;
        boolean presente = false;
        boolean esci = false;

        while (!esci) {
            if (n > ind + con / 2) {
                ind = (ind + con / 2) + 1;
            } else {
                con = (ind + con / 2) - 1;
            }
            if (ind == con) {
                presente = true;
                esci = true;
            } 
            if (ind > con) {
                presente = false;
                esci = true;
                        
            }
        }
        
        return presente;
    }

}

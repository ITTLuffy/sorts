import java.util.Scanner;

public class ricercaDicotomica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] v = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Inserisci il numero da cercare");
        int n = in.nextInt();
        System.out.println(ricerca(v, n));

        in.close();
    }

    public static boolean ricerca(int[] v, int n) {
        int ind = 0; // indice di sinistra
        int con = v.length - 1; // indice di destra
        int centrale; // elemento centrale (creata una variabile per comodità)
        boolean presente = false; // sentinella x risultato

        while (con >= ind) { // condizione ciclo
            centrale = (con + ind) / 2; // inizializzo centrale
            if (v[centrale] == n) { // condizione di uscita
                presente = true; // presente!
                break; // esco dal ciclo
            } else if (n > v[centrale]) { // aggiorno ind
                ind = centrale + 1;
            } else { // aggiorno contatore
                con = centrale - 1;
            }
        }
        return presente; // ritorno il risultato
    }

}

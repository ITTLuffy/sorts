import java.util.Scanner;

public class insertionSort {

    public static void main(String[] args) {
        int[] v = new int[5]; // vettore
        riempiVettore(v); // riempimento
        stampaVettore(v); // visualizzazione
        ordina(v); // ordinamento

    }

    /**
     * Metodo * visualizzare il vettore
     * @param v vettore
     */
    public static void stampaVettore(int[] v) { 
        System.out.print("["); 
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * Metodo * riempire il vettore
     * @param v vettore
     */
    public static void riempiVettore(int[] v) {
        System.out.println("Inserisci un numero intero");
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < v.length; i++) {
                v[i] = in.nextInt();
            }
        }
    }

    /**
     * Metodo * ordinare array
     * @param v 
     */
    public static void ordina(int[] v) {
        for (int i = 1; i < v.length; i++) { // ciclo che scorre tutto il vettore
            int in = v[i]; // elemento da cambiare
            int c = i - 1; // contatore * confronti
            // sposto gli elementi maggiori dell'iniziale in verso destra
            while(c >= 0 && v[c] > in) { // quando è maggiore di o (messo prima perché sennò da errore) e v[c] maggiore dell'inziale
                v[c+1] = v[c]; // scambio 
                c--; // decremento
            }
            // inserisco l'elemento iniziale
            v[c+1] = in;
            stampaVettore(v);
        }
    }


}

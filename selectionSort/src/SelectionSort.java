import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

    public static Random r = new Random();

    public static void main(String[] args) {

        int[] v = new int[5]; // vettore
        // riempiVettore(v); // riempimento
        // stampaVettore(v); // visualizzazione
        // ordina(v); // ordinamento
//        riempiVettore(v); // riempimento
//        stampaVettore(v); // visualizzazione
//        ordina2(v); // ordinamento
        int[] v1 = v.clone();
        riempiVettore(v1);
        stampaVettore(v1);
//        selectionSort(v);
        stupidSort(v1);
        stampaVettore(v1);

    }

    /**
     * Metodo * visualizzare il vettore Fisher-Yates
     *
     * @param v vettore
     */
    public static void stampaVettore(int[] v) {
        System.out.print("["); // quadra iniziale
        for (int i = 0; i < v.length; i++) { // elementi
            System.out.print(v[i] + " ");
        }
        System.out.println("]"); // quadra finale
    }

    /**
     * Metodo * riempire il vettore
     *
     * @param v vettore
     */
    public static void riempiVettore(int[] v) {
        System.out.println("Inserisci un numero intero"); // messaggio
        try (Scanner in = new Scanner(System.in)) { // scanner
            for (int i = 0; i < v.length; i++) { // elementi
                v[i] = in.nextInt();
            }
        }

    }

    /**
     * Metodo * ordinare array
     *
     * @param v
     */
    public static void ordina(int[] v) { // ordinamento 
        int j = 1; // contatore 
        for (int i = 0; i < v.length; i++) { // ciclo esterno
            while (j < v.length) { // ciclo interno
                if (v[j] < v[i]) { // confronto
                    int temp = v[i]; // scambio
                    v[i] = v[j]; // scambio
                    v[j] = temp; // scambio
                }
                j++; // incremento
                stampaVettore(v); // visualizzazione
            }
            j = i + 1; // setto la variabile

            stampaVettore(v); // visualizzazione

        }

    }

    /**
     * Metodo * ordinare array
     *
     * @param v
     */
    public static void ordina2(int[] v) { // ordinamento
        for (int i = 0; i < v.length; i++) { // ciclo esterno
            int posMin = i; // posizione elemento minimo
            int elMin = v[i]; // elemento minimo

            for (int j = i; j < v.length - 1; j++) { // ciclo interno
                if (v[j] > v[j + 1]) { // confronto
                    posMin = j + 1; // posizione elemento minimo
                    elMin = v[posMin]; // elemento minimo
                }
            }
            // stampo per verifica
            System.out.println(posMin); // stampa
            System.out.println(elMin);  // stampa
            if (v[i] > elMin) { // confronto
                int temp = v[i]; // scambio
                v[i] = v[posMin]; // scambio
                v[posMin] = temp; // scambio
            }
            stampaVettore(v); // visualizzazione
        }

    }

    public static void selectionSort(int[] v) {
        int posMin;

        for (int i = 0; i < v.length - 1; i++) {

            posMin = i;
            for (int j = i + 1; j < v.length; j++) { // cella con valore minimo
                if (v[j] < v[posMin]) {

                    posMin = j;

                }
            }

            int temp = v[i]; // scambio
            v[i] = v[posMin]; // scambio
            v[posMin] = temp; // scambio
            stampaVettore(v);
        }
        stampaVettore(v);

    }

    /**
     *
     * @param v
     */
    private static void shuffle(int[] v) { // passaggio per riferimento
        for (int i = 0; i < v.length; i++) {
            int rIndex = r.nextInt(v.length - 1);
            int temp = v[i]; // scambio
            v[i] = v[rIndex]; // scambio
            v[rIndex] = temp; // scambio
        }

    }

    public static void stupidSort(int[] v) {
        while (ordinato(v) == false) {
            shuffle(v);
        }

    }

    public static boolean ordinato(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i+1] < v[i]) {
                return false;
            }
        }
        
        return true;

    }

}

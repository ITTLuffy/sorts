import java.util.Arrays;
import java.util.Random;

public class StalinSort {

    public static void main(String[] args) {

        int[] v = new int[5]; // array iniziale
        riempiVettore(v); // riempio vettore
        stampaVettore(v); // stampo
        int[] v2 = ordina(v); // secondo array, a cui passo quello ordinato
        stampaVettore(v2); // stampo il risultato
    }

    /**
     * Metodo * visualizzare il vettore
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
        Random r = new Random(); // random
        for (int i = 0; i < v.length; i++) { // elementi
            v[i] = r.nextInt(0, 100);

        }

    }

    /**
     * Metodo * ordinare il vettore
     * @param v vettore di partenza
     * @return vettore diminuito di dimensione e ordinato
     */
    public static int[] ordina(int[] v) {
        int min = v[0]; // identifico l'elemento minore, di partenza
        int[] risultato = new int[v.length]; // array finale
        int c = 0; // contatore per array risultato
        
        risultato[c] = min; // inserisco il primo elemento
        c++; // e aggiorno la dimensione
        
        for (int i = 1; i < v.length; i++) { // ciclo che scorre l'array; parte da 1, perché il primo elemento è sempre ordinato
            if (v[i] >= min) { // se è maggiore o uguale al precedente
                risultato[c] = v[i]; // inserisco nell'array risultato
                c++; // incremento la dimensione
                min = v[i]; // aggiorno il minore
            }
        }
        return Arrays.copyOf(risultato, c); // ritorno l'array ordinato e con la dimensione corretta
    }

}

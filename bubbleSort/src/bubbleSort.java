import java.util.Scanner;

public class bubbleSort {

    public static Scanner in = new Scanner(System.in);
    // dimensione dinamica
    public static int dim = 0;
    // dimensione massima
    public static final int DIM_MAX = 5;

    public static void main(String[] args) {

        // array
        int[] v = new int[DIM_MAX];
        // inserimento
        for (int i = 0; i < v.length; i++) {
            System.out.println("Inserisci un numero");
            riempiVettore(v, in.nextInt());
            stampa(v);
        }

        // ordino l'array
        ordinaSupremo(v);
        // stampo il risultato
        stampa(v);

    }

    /**
     * metodo per stampare il vettore
     *
     * @param v vettore
     */
    public static void stampa(int[] v) {
        // stampo l'apertura dell'array
        System.out.print("[");
        // ciclo per stampare tutti gli elementi
        for (int i = 0; i < dim; i++) {
            System.out.print(v[i] + " ");
        }
        // stampo la chiusura dell'array
        System.out.println("]");
    }

    /**
     * metodo per ordinare il vettore
     *
     * @param v vettore
     */
    public static void ordina(int[] v) {
        int c = 0; // contatore ordinamento
        // ciclo per gestire il numero di volte che si fanno i confronti
        while (c < v.length) {
            // ciclo per maggiore e minore
            for (int i = 0; i < v.length - 1; i++) {
                // se è maggiore
                if (v[i] > v[i + 1]) {
                    // storro in una var temporanea
                    int temp = v[i];
                    // scambio
                    v[i] = v[i + 1];
                    // scambio
                    v[i + 1] = temp;
                }

            }
            // aumento il counter
            c++;
        }
    }

    /**
     * ordina ottimizzato
     * 
     * @param v vettore
     */
    public static void ordinaOttimizzato(int[] v) {
        boolean scambio;
        int c = 0;
        // ciclo per gestire il numero di volte che si fanno i confronti
        while (c < v.length) {
            scambio = false;
            // ciclo per maggiore e minore
            for (int i = 0; i < v.length - 1; i++) {
                // se è maggiore
                if (v[i] > v[i + 1]) {
                    // storro in una var temporanea
                    int temp = v[i];
                    // scambio
                    v[i] = v[i + 1];
                    // scambio
                    v[i + 1] = temp;
                    scambio = true;
                }

            }

            c++;
            if (scambio == false) {
                break;
            }
        }

    }

    /**
     * ordina ottimizzato in modo supremo
     * 
     * @param v vettore
     */
    public static void ordinaSupremo(int[] v) {
        boolean scambio;
        int c = 0;

        // ciclo per gestire il numero di volte che si fanno i confronti
        while (c < v.length) {
            System.out.println("Giro " + c);

            scambio = false;
            // ciclo per maggiore e minore
            for (int i = 0; i < v.length - 1 - c; i++) {
                // se è maggiore
                if (v[i] > v[i + 1]) {
                    // storro in una var temporanea
                    int temp = v[i];
                    // scambio
                    v[i] = v[i + 1];
                    // scambio
                    v[i + 1] = temp;
                    scambio = true;
                    stampa(v);
                }

            }

            c++;
            if (scambio == false) {
                break;
            }

        }

    }

    /**
     * Metodo per riempire il vettore
     *
     * @param v     vettore
     * @param nuovo numero da inserire
     */
    public static void riempiVettore(int[] v, int nuovo) {
        // inserisco il numero
        v[dim] = nuovo;
        // incremento la dimensione
        dim++;
    }

}

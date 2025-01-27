import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        int[] v = new int[5]; // vettore
        riempiVettore(v); // riempimento
        stampaVettore(v); // visualizzazione
        ordina(v); // ordinamento

        int[] vett = new int[5]; // vettore
        riempiVettore(vett); // riempimento
        stampaVettore(vett); // visualizzazione
        ordina2(vett); // ordinamento

    }

    /**
     * Metodo * visualizzare il vettore
     *
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
     *
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
     *
     * @param v
     */
    public static void ordina(int[] v) {
        int j = 1;
        for (int i = 0; i < v.length; i++) {
            while (j < v.length) {
                if (v[j] < v[i]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
                j++;
            }
            j = i + 1;

            stampaVettore(v);

        }

    }

    /**
     * Metodo * ordinare array
     *
     * @param v
     */
    public static void ordina2(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int posMin = i;
            int elMin = v[i];

            for (int j = i; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    posMin = j+1;
                    elMin = v[posMin];
                }
            }
            System.out.println(posMin);
            System.out.println(elMin);
            if (v[i] > elMin) {
                int temp = v[i];
                v[i] = v[posMin];
                v[posMin] = temp;
            }
            stampaVettore(v);
        }

    }

}

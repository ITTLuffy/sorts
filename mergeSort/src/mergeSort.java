import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) throws Exception {


        int[] v1 = {1, 3, 6, 7};
        int[] v2 = {0, 2, 4, 5};
        int[] result;
        result = ordina(v1, v2);
        System.out.println(Arrays.toString(result));

    }

    public static int[] ordina(int[] v1, int[] v2) {
        int i = 0;
        int j = 0;
        int c = 0;
        int[] v3 = new int[v1.length + v2.length];
        while (i < v1.length && j < v2.length) { 
            if (v1[i] < v2[j]) {
                v3[c] = v1[i];
                i++;
            } else if (v1[i] > v2[j]) {
                v3[c] = v2[j];
                j++;
            }
            c++;
        }

        while (i < v1.length) {
            v3[c] = v1[i];
            i++;
            c++;
        }
        while (j < v2.length) {
            v3[c] = v2[j];
            j++;
            c++;
        }
        return v3;

    }

}

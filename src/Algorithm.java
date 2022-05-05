import java.util.Arrays;

public class Algorithm {
    public static long version1(int[] sequence, int[] array) {
        int n = array.length;

        long start = System.currentTimeMillis();

        for (int k = sequence.length - 1; k >= 0; k--) {
            int h = sequence[k];

            for (int i = h; i < n; i++) {

                int temp = array[i];


                int j;
                for (j = i; j >= h && array[j - h] > temp; j -= h)
                    array[j] = array[j - h];


                array[j] = temp;
            }
        }
        long stop = System.currentTimeMillis();
        //System.out.println(stop-start);
        return (stop-start);
    }
    public static long version2(int[] sequence, int[] array) {

        int n = array.length;
        long start = System.currentTimeMillis();
        for (int k = sequence.length - 1; k >= 1; k--) {
            int h = sequence[k];

            for (int i = h; i < n; i++) {

                int temp = array[i];


                int j;
                for (j = i; j >= h && array[j - h] > temp; j -= h)
                    array[j] = array[j - h];


                array[j] = temp;
            }

        }
        for (int i = 0; i < 2; i++)
            for (int j = sequence[0]; j < array.length || j < 2 * sequence[0]; j++) {
                int h = j;
                while (h < array.length) {
                    if (array[h] < array[h - sequence[0]]) {
                        int temp = array[h - sequence[0]];
                        array[h - sequence[0]] = array[h];
                        array[h] = temp;
                    }
                    h += sequence[0];
                }
            }
        long stop = System.currentTimeMillis();
        //System.out.println(stop-start);
        return (stop-start);
    }
    public static long version3(int[] sequence, int[] array) {
        int n = array.length;

        long start = System.currentTimeMillis();
        for (int i = sequence.length - 1; i >= 1; i--) {
            for (int j = sequence[i]; j < array.length || j < 2 * sequence[i]; j++) {
                int h = j;
                while (h < array.length) {
                    if (array[h] < array[h - sequence[i]]) {
                        int temp = array[h - sequence[i]];
                        array[h - sequence[i]] = array[h];
                        array[h] = temp;
                    }
                    h += sequence[i];
                }

            }
        }
        int k=0;
        int h = sequence[k];

        for (int i = h; i < n; i++) {

            int temp = array[i];


            int j;
            for (j = i; j >= h && array[j - h] > temp; j -= h)
                array[j] = array[j - h];


            array[j] = temp;
        }
        long stop = System.currentTimeMillis();
        //System.out.println(stop-start);
        return (stop-start);
    }
}

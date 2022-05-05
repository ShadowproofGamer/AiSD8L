import java.util.Arrays;

public class Algorithm {
    public static long version1(int[] sequence, int[] array) {
        int n = array.length;

        long start = System.currentTimeMillis();
        // Start with a big gap, then reduce the gap
        for (int k = sequence.length - 1; k >= 0; k--) {
            int h = sequence[k];
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = h; i < n; i++) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = array[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= h && array[j - h] > temp; j -= h)
                    array[j] = array[j - h];

                // put temp (the original a[i]) in its correct
                // location
                array[j] = temp;
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
        return (stop-start);
    }
    public static long version2(int[] sequence, int[] array) {

        int n = array.length;
        long start = System.currentTimeMillis();
        // Start with a big gap, then reduce the gap
        for (int k = sequence.length - 1; k >= 1; k--) {
            int h = sequence[k];
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = h; i < n; i++) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = array[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= h && array[j - h] > temp; j -= h)
                    array[j] = array[j - h];

                // put temp (the original a[i]) in its correct
                // location
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
        System.out.println(stop-start);
        return (stop-start);
    }
    public static long version3(int[] sequence, int[] array) {
        int n = array.length;
        int[] ar = Generator.sequence1(n);
        long start = System.currentTimeMillis();
        for (int i = ar.length - 1; i >= 1; i--) {
            for (int j = ar[i]; j < array.length || j < 2 * ar[i]; j++) {
                int h = j;
                while (h < array.length) {
                    if (array[h] < array[h - ar[i]]) {
                        int temp = array[h - ar[i]];
                        array[h - ar[i]] = array[h];
                        array[h] = temp;
                    }
                    h += ar[i];
                }

            }
        }
        int k=0;
        int h = ar[k];
        // Do a gapped insertion sort for this gap size.
        // The first gap elements a[0..gap-1] are already
        // in gapped order keep adding one more element
        // until the entire array is gap sorted
        for (int i = h; i < n; i++) {
            // add a[i] to the elements that have been gap
            // sorted save a[i] in temp and make a hole at
            // position i
            int temp = array[i];

            // shift earlier gap-sorted elements up until
            // the correct location for a[i] is found
            int j;
            for (j = i; j >= h && array[j - h] > temp; j -= h)
                array[j] = array[j - h];

            // put temp (the original a[i]) in its correct
            // location
            array[j] = temp;
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
        return (stop-start);
    }
}

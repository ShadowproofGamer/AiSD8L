public class Backup {
    public static long version1(int[] sequence, int[] array) {
        long start = System.currentTimeMillis();
        for (int i = sequence.length - 1; i >= 0; i--) {
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
            //System.out.println(sequence[i]);
            //System.out.println(Arrays.toString(array));
        }

        //ArrayInsertSort.sort(array);
        long stop = System.currentTimeMillis();
        return (stop-start);
    }
    public static long version2(int[] sequence, int[] array) {
        long start = System.currentTimeMillis();
        for (int i = sequence.length - 1; i >= 0; i--) {
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
            //System.out.println(sequence[i]);
            //System.out.println(Arrays.toString(array));
        }
        ArrayBubbleSort.sort(array);
        long stop = System.currentTimeMillis();
        return (stop-start);
    }
    public static int[] version3(int[] sequence, int[] array) {
        //TODO
        for (int i = sequence.length - 1; i >= 0; i--) {
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
            //System.out.println(sequence[i]);
            //System.out.println(Arrays.toString(array));
        }
        ArrayInsertSort.sort(array);
        return array;
    }
}

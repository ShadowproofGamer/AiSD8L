class ShellSort {
    /* An utility function to print array of size n*/
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = Generator.integerArray(5000);
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        System.out.println("Array before sorting");
        printArray(arr);

        ShellSort ob = new ShellSort();
        ob.sort1(arr);

        System.out.println("Array after sorting");
        printArray(arr);


        System.out.println();
        System.out.println("Array before sorting");
        printArray(arr2);

        ob.sort2(arr2);

        System.out.println("Array after sorting");
        printArray(arr2);

        System.out.println();
        System.out.println("Array before sorting");
        printArray(arr3);

        ob.sort3(arr3);

        System.out.println("Array after sorting");
        printArray(arr3);
    }

    /* function to sort arr using shellSort */
    void sort1(int[] arr) {

        int n = arr.length;
        int[] ar = Generator.sequence1(n);

        long start = System.currentTimeMillis();
        // Start with a big gap, then reduce the gap
        for (int k = ar.length - 1; k >= 0; k--) {
            int h = ar[k];
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = h; i < n; i++) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= h && arr[j - h] > temp; j -= h)
                    arr[j] = arr[j - h];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }
    void sort2(int[] arr) {

        int n = arr.length;
        int[] ar = Generator.sequence1(n);
        long start = System.currentTimeMillis();
        // Start with a big gap, then reduce the gap
        for (int k = ar.length - 1; k >= 1; k--) {
            int h = ar[k];
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = h; i < n; i++) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= h && arr[j - h] > temp; j -= h)
                    arr[j] = arr[j - h];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        for (int i = 0; i < 2; i++)
        for (int j = ar[0]; j < arr.length || j < 2 * ar[0]; j++) {
            int h = j;
            while (h < arr.length) {
                if (arr[h] < arr[h - ar[0]]) {
                    int temp = arr[h - ar[0]];
                    arr[h - ar[0]] = arr[h];
                    arr[h] = temp;
                }
                h += ar[0];
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }
    void sort3(int[] arr) {

        int n = arr.length;
        int[] ar = Generator.sequence1(n);
        long start = System.currentTimeMillis();
        for (int i = ar.length - 1; i >= 1; i--) {
            for (int j = ar[i]; j < arr.length || j < 2 * ar[i]; j++) {
                int h = j;
                while (h < arr.length) {
                    if (arr[h] < arr[h - ar[i]]) {
                        int temp = arr[h - ar[i]];
                        arr[h - ar[i]] = arr[h];
                        arr[h] = temp;
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
            int temp = arr[i];

            // shift earlier gap-sorted elements up until
            // the correct location for a[i] is found
            int j;
            for (j = i; j >= h && arr[j - h] > temp; j -= h)
                arr[j] = arr[j - h];

            // put temp (the original a[i]) in its correct
            // location
            arr[j] = temp;
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }
}
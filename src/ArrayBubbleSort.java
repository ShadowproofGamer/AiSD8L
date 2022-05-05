import java.util.Comparator;

public class ArrayBubbleSort {

    public static int[] sort(int[] list) {
        int size = list.length;
        for (int pass = 1; pass < size; ++pass) {
            for (int left = 0; left < (size - pass); ++left) {
                int right = left + 1;
                if (list[left] > list[right])
                    swap(list, left, right);
            }
            //System.out.println(Arrays.toString(list));
        }
        return list;
    }

    private static void swap(int[] list, int left, int right) {
        int temp = list[left];
        list[left] = list[right];
        list[right] = temp;
    }

}

import java.util.Comparator;

public class ArrayInsertSort{

    public static int[] sort(int[] list) {
        for (int i = 1; i < list.length; ++i) {
            int value = list[i], temp;
            int j;
            for (j = i; j > 0 && value < (temp = list[j - 1]); --j)
                list[j] = temp;
            list[j] = value;
            //System.out.println(Arrays.toString(list));
        }
        return list;
    }
}

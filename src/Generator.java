import java.util.Arrays;
import java.util.Random;

public class Generator {
    public static int[] sequence1(int n) {
        int[] result = new int[100];
        int h = 1;
        int j = 1;
        result[0]=h;
        for (int i = 1; i < n; i++) {
            h = 3 * h + 1;
            if (h>=n)break;
            result[i] = h;
            j++;
        }
        result = Arrays.copyOfRange(result,0, j);
        return result;
    }

    public static int[] sequence2(int n) {
        int[] result = new int[100];
        int j = 0;
        for (int i = 0; i < n; i++) {
            int h=(int) (Math.pow(2, i + 1) - 1);
            if (h>=n)break;
            result[i] = h;
            j++;
        }
        result = Arrays.copyOfRange(result,0, j);
        return result;
    }

    public static int[] sequence3(int n) {
        int[] result = new int[100];
        result[0]=1;
        int j = 1;
        for (int i = 1; i < n; i++) {
            int h = (int) (Math.pow(2, i) + 1);
            if (h>=n)break;
            result[i] = h;
            j++;
        }
        result = Arrays.copyOfRange(result,0, j);
        return result;
    }

    public static int[] sequence4(int n) {
        int[] result = new int[100];
        int prev1 = 1;
        int prev2 = 0;
        result[0]=prev1;
        int j =1;
        for (int i = 1; i < n; i++) {
            int h = (prev1 + prev2);
            if (h>=n)break;
            result[i] = h;
            prev2=prev1;
            prev1=h;
            j++;
        }
        result = Arrays.copyOfRange(result,0, j);
        return result;
    }
    public static int[] integerArray(int n){
        Random random = new Random();
        int[] result = new int[n];
        int b = Math.min(100 * n, 10000000);
        for (int i = 0; i < n; i++) {
            result[i]=random.nextInt(b);
        }
        return result;
    }
}

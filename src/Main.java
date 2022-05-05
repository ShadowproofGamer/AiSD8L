import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] amount = {5000, 10000, 50000, 100000};
        int[] s1 = Generator.sequence1(5000);
        int[] array1 = Generator.integerArray(5000);
        for (int a : amount) {
            int[] array = Generator.integerArray(a);
            int[][] seq = {Generator.sequence1(a), Generator.sequence2(a), Generator.sequence3(a), Generator.sequence4(a)};
            for (int i=0;i<4;i++) {
                System.out.println("amount: "+a+" sequence: "+i+" algorithm1: "+Algorithm.version1(seq[i], array));
                System.out.println("amount: "+a+" sequence: "+i+" algorithm2: "+Algorithm.version2(seq[i], array));
                System.out.println("amount: "+a+" sequence: "+i+" algorithm3: "+Algorithm.version3(seq[i], array));
                //System.out.println(Arrays.toString(Algorithm.version3(s, array)));
            }
        }
        //System.out.println(Arrays.toString(s1));
        //System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(Algorithm.version1(s1, array1)));
    }
}

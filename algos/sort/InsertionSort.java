package algos.sort;

/**
 * User: ifedan
 * Date: 4/21/15
 */
public class InsertionSort {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 & a[j] > a[j-1]; j--) {    //TODO: Reverse order
                a[j] = a[j]^a[j-1];
                a[j-1] = a[j]^a[j-1];
                a[j] = a[j]^a[j-1];
            }
        }
    }

}

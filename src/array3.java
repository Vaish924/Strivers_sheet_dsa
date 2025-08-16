import java.util.Arrays;

public class array3 {
    static int findgap(int gap) {
        if (gap <= 1) return 0;
        return (gap + 1) / 2;
    }

    static void find(int[] arr1, int[] arr2, int n, int m) {
        int gap = n + m;
        while (gap > 0) {
            for (int i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }
            int i = (gap > n) ? n : 0;
            int j = (gap > n) ? gap - n : 0;
            while (i < n && j < m) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
                i++;
                j++;
            }
            for (j = 0; j + gap < m; j++) {
                if (arr2[j] > arr2[j + gap]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + gap];
                    arr2[j + gap] = temp;
                }
            }

            gap = findgap(gap);
        }
    }

    public static void main(String args[]) {
        int[] arr1 = {2, 7, 4};
        int[] arr2 = {9, 3, 5};
        find(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}

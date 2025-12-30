// brute force method :

// package binary_search.on_answers;

public class mBoquets {

    public static int findNoofBoquets(int[] arr, int k, int m) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        for (int i = min; i <= max; i++) {
            int count = 0;
            int noofb = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= i) {
                    count++;

                } else {
                    noofb += (count / k);
                    count = 0;
                }
            }
            noofb += (count / k);

            if (noofb >= m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int k = 3;
        int m = 2;

        int val = findNoofBoquets(arr, k, m);
        System.out.println(val);

    }
}
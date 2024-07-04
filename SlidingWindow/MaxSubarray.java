package SlidingWindow;

public class MaxSubarray {
    public static void main(String[] args) {
        int arr[] = {2, 9, 31, -4, 21, 7};
        int k = 3;

        // Initialize the sum of the first window
        int currsum = 0;
        for (int i = 0; i < k; i++) {
            currsum += arr[i];
        }

        int maxsum = currsum;

        // Slide the window from start to end of the array
        for (int i = k; i < arr.length; i++) {
            currsum += arr[i] - arr[i - k]; // Slide the window forward
            maxsum = Math.max(maxsum, currsum);
        }

        System.out.println(maxsum);
    }
}

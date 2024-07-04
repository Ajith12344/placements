package Backtrackings;

public class permuArray {
    static int count = 0;

    static void printPerm(int[] arr, int start) {
        if (start == arr.length - 1) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            count++;
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            printPerm(arr, start + 1);
            swap(arr, start, i); // backtrack
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printPerm(arr, 0);
        System.out.println("Total permutations: " + count);
    }
}

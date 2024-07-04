package TwoPointers;

import java.util.Arrays;

public class TwoSum {
    public int[] Twoo(int arr[],int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left+1,right+1};
                
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[2];
    }
    public static void main(String[] args) {
        TwoSum s=new TwoSum();int target=9;
        int arr[]={2,7,5,6,8};
        Arrays.sort(arr);
        int a[]=s.Twoo(arr, target);
        System.out.println(Arrays.toString(a));

    }
}

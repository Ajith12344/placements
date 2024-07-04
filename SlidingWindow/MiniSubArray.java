package SlidingWindow;

public class MiniSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int currsum=0;int low=0;int high=0;
        int minslidlen=Integer.MAX_VALUE;
        while (high<nums.length) {
            currsum+=nums[high];
            high++;
            while (currsum>=target) {
                int windowsize=high-low;
                minslidlen=Math.min(minslidlen, windowsize);
                
                currsum-=nums[low];
                low++; 
            }
        }
        return minslidlen==Integer.MAX_VALUE?0:minslidlen;
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,2,4,3};
        MiniSubArray m=new MiniSubArray();
        int l=m.minSubArrayLen(7, nums);
        System.out.println(l);
    }
}

package com.dynamicprogramming;

public class LargestIncreasingSubSequence {
	public static void main(String[] args) {
		int[] arr={1, 3, 5,4,7,3, 23, 2};
		longestIncreasingSubsequence(arr);
	}
	
	 public static int longestIncreasingSubsequence(int[] nums) {
	        // write your code here
	        if (nums == null || nums.length == 0) return 0;
	 
	        int dp [] = new int[nums.length];
	        dp[0] = 1;
	        int max = 1;
	        for(int i = 1; i<nums.length; i++){
	            dp[i] = 1;
	            for(int j = 0 ; j<i; j++){
	                if(nums[j] <= nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1) ;
	                max = Math.max(dp[i], max);
	            }
	        }
	        return max;
	    }
}

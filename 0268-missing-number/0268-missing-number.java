class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=n*(n+1)/2;
        int actualoutcome=0;
        for(int i=0;i<nums.length;i++){
            actualoutcome+=nums[i];
        }
        return expectedsum-actualoutcome;
        
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int i;
        int temp;
        int nozerofound=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
             
                temp=nums[i];
                nums[i]=nums[nozerofound];
                nums[nozerofound]=temp;
                nozerofound++;
                }
               
            
        }
        
        
    }
}
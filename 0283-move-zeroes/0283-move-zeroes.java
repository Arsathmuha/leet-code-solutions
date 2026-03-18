class Solution {
    public void moveZeroes(int[] nums) {
        int numsLength=nums.length;
        int i,index=0;
        for(i=0;i<numsLength;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                index++;
            }
        }
        
    }
}
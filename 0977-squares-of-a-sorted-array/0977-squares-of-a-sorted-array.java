class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int i = 0, j = n-1, k = n-1;
        while(i<=j){
            int is = nums[i] * nums[i];
            int js = nums[j] * nums[j];
            if(is>js){
                result[k]= is;
                i++;
            }else{
                result[k] = js;
                j--;
            }
            k--;    
        }return result;
        
    }
}
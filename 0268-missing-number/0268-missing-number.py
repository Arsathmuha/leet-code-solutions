class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        if nums[0]!=0:
            return 0
            
        for i in range(1,len(nums)):
            diff=nums[i] - nums[i-1]
            print(diff,nums[i])
            if diff==2:
                return nums[i]-1
            
        return len(nums)
            
        
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        c=nums[0]
        count=0
        for i in nums:
            if(i==c):
                count+=1
            else:
                if(count>0):
                    count-=1
                else:
                    c=i
                    count=1
        return c
        



        
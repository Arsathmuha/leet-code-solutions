class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nm= {}
        for i , num in enumerate(nums):
            c = target - num
            if c in nm:
                return [nm[c], i]
            nm[num] = i
        
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        ns = set(nums)
        for i in range(len(nums) + 1):
            if i not in ns:
                return i

            
        
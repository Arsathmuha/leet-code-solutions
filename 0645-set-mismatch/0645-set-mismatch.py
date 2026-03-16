class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        seen = set()
        n = len(nums)
        d = 0

        for num in nums:
            if num in seen:
                d = num
            seen.add(num)

        for i in range(1,n+1):
            if i not in seen:
                m = i
        return [d, m]
            
        
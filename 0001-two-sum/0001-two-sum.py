class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map={}

        for i, num in enumerate(nums):
            compliment = target-num
            if compliment in num_map:
                return [num_map[compliment], i]
            num_map[num] = i
        
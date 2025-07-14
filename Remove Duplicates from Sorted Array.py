class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0  # Edge case: empty list

        i = 0  # Pointer for where to write the next unique number

        for j in range(1, len(nums)):
            if nums[j] != nums[i]:   # Found a new unique number
                i += 1
                nums[i] = nums[j]   # Put that unique number in the next spot

        return i + 1  # Total unique numbers

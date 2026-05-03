class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        a=set(nums)
        ml=0

        for i in a:
            if i-1 not in a:
                c=i
                l=1
                while c+1 in a:
                    c+=1
                    l+=1
                ml=max(ml,l)

        return ml
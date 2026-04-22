class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        ps=0
        c=0
        hm={0:1}

        for num in nums:
            ps+=num

            if ps-k in hm:
                c+=hm[ps-k]
            hm[ps]=hm.get(ps,0) + 1
        return c
            

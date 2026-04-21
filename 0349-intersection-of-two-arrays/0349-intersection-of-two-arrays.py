class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        count={}
        result=[]

        for num in nums1:
            count[num]=1

        for num in nums2:
            if num in count and count[num]==1:
                result.append(num)
                count[num]=0

        return result
        


        
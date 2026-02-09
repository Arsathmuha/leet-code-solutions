class Solution:
    def sortColors(self, nums: List[int]) -> None:
        arr=[]
        c=0
        a=0
        b=0
        for i in range(len(nums)):
            if nums[i]==0:
                c+=1
            elif nums[i]==1:
                a+=1
            else:
                arr.append(nums[i])

        nums[:]=c*[0]+a*[1]+arr
        
        
class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        j=0
        result=[]
        for i in range(1,n+1):
            if j==len(target):
                break
            
            if i==target[j]:
                result.append("Push")
                j+=1

            else:
                result.append("Push")
                result.append("Pop")

        return result
        
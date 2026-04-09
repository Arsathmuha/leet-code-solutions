class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        ans=""
        j=0

        for i in range(len(s)):
            while j<len(t):
                if s[i]==t[j]:
                    ans+=s[i]
                    j+=1
                    break
                j+=1
                

        if ans==s:
            return True 
        else:
            return False
        
class Solution:
    def longestPalindrome(self, s: str) -> str:
        start=0
        maxlen=1

        def expand(left,right):
            while left>=0 and right<len(s) and s[left]==s[right]:
                left-=1
                right+=1
            return left+1,right-1

        for i in range(len(s)):
            left1, right1=expand(i,i)
            len1=right1-left1+1

            if len1>maxlen:
                start=left1
                maxlen=len1

            left2, right2=expand(i,i+1)
            len2=right2-left2+1

            if len2>maxlen:
                start=left2
                maxlen=len2

        return s[start:start+maxlen]
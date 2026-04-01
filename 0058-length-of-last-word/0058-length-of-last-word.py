class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s =  s.rstrip()
        ans=""
        for ch in s:
            if ch==" ":
                ans=""
            ans+=ch
            ans=ans.strip()
        print(ans)

        return len(ans)
        
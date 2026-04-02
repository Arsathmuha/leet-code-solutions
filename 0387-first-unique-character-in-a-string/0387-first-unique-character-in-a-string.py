class Solution:
    def firstUniqChar(self, s: str) -> int:
        c={}

        for ch in s:
            c[ch]=c.get(ch,0)+1

        for i in range(len(s)):
            if c[s[i]]==1:
                return i

        return -1
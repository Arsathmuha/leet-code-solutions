class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen=set()
        left=0
        ml=0

        for right in range(len(s)):
            while s[right] in seen:
                seen.remove(s[left])
                left+=1

            seen.add(s[right])
            ml=max(ml,right-left+1)

        return ml
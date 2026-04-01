class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.rstrip()
        ans = ""

        for ch in s:
            if ch == " ":
                ans = ""
            else:
                ans += ch

        return len(ans)
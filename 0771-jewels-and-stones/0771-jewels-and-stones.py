class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        c=0
        for ch in stones:
            if ch in jewels:
                c+=1

        return c

        
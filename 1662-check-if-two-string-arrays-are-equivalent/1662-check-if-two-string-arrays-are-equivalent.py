class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        n1=""
        n2=""
        for i in word1:
            n1+=i
        for j in word2:
            n2+=j

        if n1==n2:
            return True
        else:
            return False
        
class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        arr=[]
        for i in s:
            arr= [i] + arr
        for i in range(len(s)):
            s[i]=arr[i]
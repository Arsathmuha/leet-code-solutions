class Solution:
    def countSegments(self, s: str) -> int:
        arr = []
        c = ""

        for ch in s:
            if ch != " ":
                c += ch
            else:
                if c != "":
                    arr.append(c)
                    c = ""
        if c != "":
            arr.append(c)

        return len(arr)
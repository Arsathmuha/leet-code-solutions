class Solution:
    def simplifyPath(self, path: str) -> str:
        res = []

        for part in path.split("/"):
            if not part or part == ".":
                continue
            elif part == "..":
                if res:
                    res.pop()
            else:
                res.append(part)
        
        return "/" + "/".join(res)
        
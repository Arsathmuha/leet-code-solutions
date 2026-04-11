class Solution:
    def judgeCircle(self, moves: str) -> bool:
        h=""
        l=""
        for ch in moves:
            if ch =='R' or ch== 'L':
                l += ch
            elif ch =='U' or ch== 'D':
                h += ch
        if l.count('R') == l.count('L') and h.count('U') == h.count('D'):
            return True
        else:
            return False
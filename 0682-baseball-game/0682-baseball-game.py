class Solution:
    def calPoints(self, operations: List[str]) -> int:
        score = []
        for x in operations:
            if x == 'C':
                score.pop()
            elif x == 'D':
                score.append(2*score[-1])
            elif x == '+':
                score.append(score[-2] + score[-1])
            else:
                score.append(int(x))
        print(score)   
        return sum(score)    

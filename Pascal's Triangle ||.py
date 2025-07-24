class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        row=[1]
        
        for _ in range(rowIndex):
            newrow=[1]
            for i in range(1,len(row)):
                newrow.append(row[i-1]+row[i])
            newrow.append(1)
            row=newrow

        return row

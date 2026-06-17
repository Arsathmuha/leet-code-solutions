from typing import List

class Solution:
    def solveSudoku(self, board: List[List[str]]) -> None:
        rows = [set('123456789') for _ in range(9)]
        cols = [set('123456789') for _ in range(9)]
        boxes = [set('123456789') for _ in range(9)]

        # Remove already filled numbers
        for i in range(9):
            for j in range(9):
                if board[i][j] != '.':
                    num = board[i][j]
                    rows[i].discard(num)
                    cols[j].discard(num)
                    boxes[(i // 3) * 3 + (j // 3)].discard(num)

        def solve():
            for i in range(9):
                for j in range(9):
                    if board[i][j] == '.':
                        box_idx = (i // 3) * 3 + (j // 3)

                        candidates = rows[i] & cols[j] & boxes[box_idx]

                        for num in list(candidates):
                            board[i][j] = num

                            rows[i].remove(num)
                            cols[j].remove(num)
                            boxes[box_idx].remove(num)

                            if solve():
                                return True

                            board[i][j] = '.'

                            rows[i].add(num)
                            cols[j].add(num)
                            boxes[box_idx].add(num)

                        return False

            return True

        solve()
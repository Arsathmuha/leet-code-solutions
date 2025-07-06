from typing import List
from collections import Counter

class Solution:
    def findLucky(self, arr: List[int]) -> int:
        freq = Counter(arr)  # Count frequencies
        lucky = -1  # Initialize result
        
        for num, count in freq.items():
            if num == count:
                lucky = max(lucky, num)
        
        return lucky

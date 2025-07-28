class Solution:
    def maxArea(self, height):
        left = 0
        right = len(height) - 1
        max_area = 0

        while left < right:
            # Calculate the current area
            width = right - left
            current_height = min(height[left], height[right])
            area = width * current_height

            # Update max area if needed
            if area > max_area:
                max_area = area

            # Move the pointer at the shorter line
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_area

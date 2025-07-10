# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

from typing import Optional  # needed for type hints

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        # Create a dummy node to start the new list
        dummy = ListNode()
        current = dummy  # pointer to build the new list

        # Loop through both lists until one runs out
        while list1 and list2:
            if list1.val < list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        # Attach the rest of the list that is not empty
        if list1:
            current.next = list1
        else:
            current.next = list2

        return dummy.next  # return the merged list, skipping the dummy

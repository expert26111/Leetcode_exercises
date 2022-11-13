from typing import List
from pprint import pprint

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)-1):
            for j in range(i + 1, len(nums)):
                if nums[j] == target - nums[i]:
                    return [i, j]


nums = [2,7,11,15] 
target = 9
temp = Solution()
list_Solution = Solution().twoSum(nums,target)
if list_Solution is not None:
    pprint(list_Solution)
   # print(*list_Solution, sep='\n')

nums2 = [3,2,4]
target2 = 6
temp = Solution()
list_Solution = Solution().twoSum(nums2,target2)
if list_Solution is not None:
    pprint(list_Solution)


nums3 = [3,3]
target3 = 6
temp = Solution()
list_Solution = Solution().twoSum(nums3,target3)
if list_Solution is not None:
    pprint(list_Solution)
problem
---
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example
---
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

Solution
---
- 해쉬맵을 사용하여 푼다.
- for 문을 2번 순회할 수 있고, 한번 순회할 수 있는데, 한 번 순회할 경우 더 빠르게 해결할 수 있다.
- 메모리 문제의 경우 해결이 쉽지 않음...
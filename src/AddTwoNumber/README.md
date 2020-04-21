problem
---
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example
---
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)

Output: 7 -> 0 -> 8

Explanation: 342 + 465 = 807.

Solution
---
while문을 돌면서 캐리를 추가하는 식으로 계산을 하였는데, 
시간이 자바에서 하위권이다. 다른방법을 찾아야 할듯...
중간의 하나의 노드만 남을 경우 예외처리를 해주었더니
결과적으로 아래와 같은 결과를 얻었다.

Result
---
2 ms, faster than 61.76% of Java online submissions for Add Two Numbers.
Memory Usage: 39.5 MB, less than 99.69% of Java online submissions for Add Two Numbers.

## Questions:

1. <b> Write a program to reverse an array or string.
 Given an array (or string), the task is to reverse the array/string.  </b>
 Examples :
```
Input  : arr\[\] = {1, 2, 3}
Output : arr\[\] = {3, 2, 1}

Input :  arr\[\] = {4, 5, 1, 2}
Output : arr\[\] = {2, 1, 5, 4}
```
Solution:    [ReverseArray.cpp](Codes/Reverse-Array.cpp)
<u>Approach:</u>
- Initialize start and end indexes as start = 0, end = n-1   
- In a loop, swap arr\[start\] with arr\[end\] and change start and end as follows :   
start = start +1, end = end – 1

---
2. <b>Write a C function to return minimum and maximum in an array. Your program should make the minimum number of comparisons.</b>

Solution: [Minimum-Maximum-Array1.cpp](codes/min-max-array1.cpp) <br>
 [Minimum-Maximum-Array2.cpp](codes/min-max-array2.cpp)<br>
  [Minimum-Maximum-Array3.cpp](codes/min-max-array3.cpp)<br>
  
We <u>Return Multiple Values</u> from a C function using Structures & Pointers. Start by creating a Structure
```cpp
struct pair
{
	int min;
	int max;
}
``` 

<u>Approach 1: Simple Linear Search</u>
- Initialize values of min and max as minimum and  maximum of the first two elements respectively. Starting from 3rd, compare each element with max and min, and change max and min accordingly
--> Time Complexity: 0(n)

<u>Approach 2: </u>
- Divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array.
	
<u>Approach 3: Compare in Pairs </u>
- If n is odd then initialize min and max as first element.  
- If n is even then initialize min and max as minimum and  aximum of the first two elements respectively.   
- For rest of the elements, pick them in pairs and compare their  maximum and minimum with max and min respectively.
---
3. <b>Given an array **arr\[\]** and a number **K** where K is smaller than size of array, the task is to find the **Kth smallest** element in the given array. It is given that all array elements are distinct.</b>
 - **Input:**
N = 6
arr\[\] = 7 10 4 3 20 15
K = 3
**Output :** 7
**Explanation :**
3rd smallest element in the given 
array is 7.

Solution: 
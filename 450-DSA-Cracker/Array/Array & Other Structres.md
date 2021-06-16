# Array & Other Structures
An Array is a collection of variables of the same type that are referred to through a common name.
- A specific element in array is accessed by an index.
- The most common array is <i>null-terminated string</i>, which is simpy an array of characters terminated by null.

## 1. Single-Dimension Array
- Declaration: 
```c++
type var_name[size];
```
- A dynamic array is an array whose size can be changed during the execution of the program.

### 1.1 Vectors
- A vector is a dynamic array that allows us to efficiently add and remove elements at the end of the structure. 
- For example, the following code creates an empty vector and adds three elements to it:
```c++
vector<int> v;
v.push_back(3); // [3]
v.push_back(2); // [3,2]
v.push_back(5); // [3,2,5]
```
- Then, the elements can be accessed like in an ordinary array:
```c++
cout << v[0] << "\n"; // 3
cout << v[1] << "\n"; // 2
cout << v[2] << "\n"; // 5
```
- Another way to create a vector is to give a list of its elements:
```c++
vector<int> v = {2,4,2,5,1};
```
- the number of elements and their initial values can be given as:
 ```c++
 vector<int> a(8); // size 8, initial value 0
vector<int> b(8,2); // size 8, initial value 2
```

- The function <b>size</b> returns the number of elements in the vector. For example, the following code iterates through the vector and prints its elements:
```c++
for (int i = 0; i < v.size(); i++) {
cout << v[i] << "\n";
}
```
-	A shorter way to iterate through a vector is as follows:
```c++
	for (auto x : v) {
		cout << x << "\n";
	}
```
- The function <b>back</b> returns the last element of a vector, and the function <b>pop_back</b> removes the last element:
```c++
vector<int> v = {2,4,2,5,1};
cout << v.back() << "\n"; // 1
v.pop_back();
cout << v.back() << "\n"; // 5
```

### 1.2 Iterators & Ranges
- An iterator is a variable that points to an element of a data structure. The iterator begin points to the first element of a data structure, and the iterator end points to the position after the last element.
- A range is a sequence of consecutive elements in a data structure. The usual way to specify a range is to give iterators to its first element and the position after its last element.
- The C++ standard library functions typically operate with ranges. For example, the following code first sorts a vector, then reverses the order of its elements, and finally shuffles its elements.
```c++
sort(v.begin(),v.end());
reverse(v.begin(),v.end());
random_shuffle(v.begin(),v.end());
```
- The element to which an iterator points can be accessed using the * syntax. For example, the following code prints the first element of a vector:
``` c++
cout << *v.begin() << "\n";
```

## 2 Other Structures
### 2.1 Deque
- A deque is a dynamic array that can be efficiently manipulated at both ends of the structure. Like a vector, a deque provides the functions push_back and pop_back, but it also provides the functions push_front and pop_front which are not available in a vector. 
- A deque can be used as follows:
```c++
deque<int> d;
d.push_back(5); // [5]
d.push_back(2); // [5,2]
d.push_front(3); // [3,5,2]
d.pop_back(); // [3,5]
d.pop_front(); // [5]
```
### 2.2 Stack
- A stack has the functions push and pop for inserting and removing elements at the end of the structure and the function top that retrieves the last element:
```c++
stack<int> s;
s.push(2); // [2]
s.push(5); // [2,5]
cout << s.top() << "\n"; // 5
s.pop(); // [2]
cout << s.top() << "\n"; // 2
```

### 2.3 Queue
- In a queue, elements are inserted at the end of the structure and removed from the front of the structure. Both the functions front and back are provided for accessing the first and last element
```c++
queue<int> q;
q.push(2); // [2]
q.push(5); // [2,5]
cout << q.front() << "\n"; // 2
q.pop(); // [5]
cout << q.back() << "\n"; // 5
```
---
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
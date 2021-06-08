# Array 
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

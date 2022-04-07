# STACK

### Top 7 Parent Questions 

Concept 1: 

    - Nearest Greater to Left
    - Nearest Greater to Right
    - Nearest Smaller to Left
    - Nearest Smaller to Right

Concept 2:

    - Stock Span Problem
    - StrMaximum Areat of Histogram

Concept 3:

    - Max Area of Rectangle in Binary Matrix

Concept 4:

    - Rain Water Trapping
    - Implementing a Min Stack
    - Implementing Stack using Heap
    - Celebrity Problem
    - Longest valid Parenthesis
    - Iterative Tower of Hanoi

### Identification

- Stack Questions have 'Array'
- (IMP) Bruteforcing - O(n^2) <---- 100% the question can be solved usnig stack
    
    ```cpp
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
    ```
    Here, if the second loop is anyhow dependent on the first loop i.e.
    
    ```cpp
     for(int i=0;i<n;i++)
        - j --> 0 to i ; j++
        - j --> i to 0 ; j--
        - j --> i to n ; j++
        - j --> n to i ; j--
   ```


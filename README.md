# CNN: Nicole Zhou + Duck, Nada Hameed + Ray, Corina Chen + BinkTop
### Song of the Week: The Duck Song / Bryant Oden

### Bubble Sort
* Best Case - O(n): They're all sorted.
  * No swaps would be made because each element is less than its following element, so there are none necessary.
  * Time Complexity: The number of passes depends on the size of the ArrayList; if the size is n, the number of passes is n - 1. If n increased by 1, so would the number of passes, making it a linear function.

* Worst Case - O(n^2): They're in reverse order.
  * During the first pass, n - 1 swaps would be made, since all the elements are not in the right order. During the second pass, n - 2 swaps would be made, with one fewer swap being made as the number of passes increases.
  * The time complexity would be a quadratic function, because for each comparison in a pass, there is a swap.


### Selection Sort
* Best Case - O(n^2): None
* Worst Case - O(n^2): None
  * Time Complexity: There are n - 1 passes being made, and the largest number that isn't in the correct order must be swapped, so as the size of the ArrayList increases, there is a quadratic connection.

### Insertion Sort
* Best case - O(n): They're all sorted.
  * No swaps will be done and fewer comparisons will be made. As the size of the ArrayList increases, the number of times the "partition" of sorted elements has to move increases linearly.
  * For sorted array of 5:
```
The number of comparisons is 4.
The number of swaps made is 0.
The number of passes is 4.
```
* Worst Case - O(n^2): In reverse order.
  * Per pass, the maximum number of swaps is made inside the partition in order to make it sorted. As a result, the number of swaps is the partition's index.
  * This results in a quadratic relationship, because the number of passes is n - 1, and within each pass, the maximum number of swaps is made.

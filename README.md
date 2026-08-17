# 📈 50 Days of Coding Challenge — Key Takeaway Log

A daily log tracking my progress, algorithm designs, trade-offs, and key learnings as I conquer 50 days of Data Structures and Algorithms.

---

## 🕒 Week 1: Arrays & Basic String Manipulation

### Day 1: Two Sum
* **Initial Thought:** Used a nested loop approach checking all element pairs.
* **Trade-off:** Easy to implement with `O(1)` memory, but highly inefficient at `O(n²)` time.
* **Future Growth:** Explored optimizing this to `O(n log n)` using Binary Search and `O(n)` using a Hash Map by trading space for execution speed.

### Day 2: Rotate Array
* **Initial Thought:** Using an extra array to hold shifted elements, which takes `O(N)` extra space.
* **Trade-off:** Optimized to an in-place algorithm using array reversal. This reduces auxiliary space down to `O(1)` while keeping time complexity at `O(N)`.
* **Key Learning:** Normalizing with `k = k % n` is essential to prevent out-of-bounds errors when the rotation count exceeds the array size.

### Day 3: Valid Anagram
* **Initial Thought:** Converted both strings to character arrays, sorted them using `Arrays.sort()`, and checked if they were identical.
* **Trade-off:** Extremely clean and readable solution, but requires `O(n log n)` time complexity due to the sorting step and `O(n)` space to store the arrays.
* **Key Learning:** Discovered that this can be further optimized to `O(n)` time and `O(1)` space by using a fixed-size frequency array (size 26) to count character occurrences instead of sorting.

### Day 4: Sort Colors
* **Initial Thought:** Counted the frequencies of 0s, 1s, and 2s in a first pass, then overwrote the original array in a second pass based on those counts.
* **Trade-off:** Achieved **0 ms runtime (Beats 100%)** with an optimal `O(n)` time complexity and `O(1)` auxiliary space, but required two full passes through the array.
* **Key Learning:** Explored how this can be further optimized into a single pass using the **Dutch National Flag algorithm** (Three-way partitioning) with three separate pointers.

### Day 5: Transpose Matrix
* **Initial Thought:** Initialized a new matrix with inverted row and column dimensions, copying elements across the main diagonal.
* **Trade-off:** Achieved an optimal time complexity of `O(N)` where `N` is the total number of elements in the matrix, and an output space complexity of `O(N)` to allocate the new grid.
* **Key Learning:** Learned that while square matrices can theoretically be transposed in-place with `O(1)` auxiliary space, non-square rectangular matrices strictly require allocating a new matrix with swapped dimensions.

### Day 6: Rotate Image
* **Initial Thought:** Considered allocating a secondary 2D matrix to manually map row elements into columns.
* **Trade-off:** Achieved a perfect **0 ms runtime (Beats 100%)** using an **in-place** matrix modification strategy that takes `O(N²)` time complexity but limits auxiliary space to a strict `O(1)`.
* **Key Learning:** Mastered 2D matrix manipulation by combining two fundamental geometric steps: first transposing the matrix along its main diagonal, and then reversing each individual row to complete the 90-degree clockwise rotation.

### Day 7: Isomorphic Strings
* **Initial Thought:** Mapping character pairs dynamically using a standard high-level lookup dictionary structure.
* **Trade-off:** Achieved an impressive **5 ms runtime (Beats 98.60%)** and **43.50 MB memory usage (Beats 97.24%)** with an optimal time complexity of `O(N)` where `N` is the string length, and a fixed space complexity of `O(1)` by utilizing a fixed-size (128) character tracking array as high-speed index lookups.
* **Key Learning:** Learned that tracking bidirectional mapping constraints in both directions (`s -> t` and `t -> s`) ensures deterministic structural integrity, safely preventing multi-character collisions.

---

## 🕒 Week 2: Advanced Strings & Advanced Binary Search

### Day 8: String Compression
* **Initial Thought:** Utilized a `StringBuilder` to sequentially collect the compressed characters and their respective group frequencies, then overwrote the initial array.
* **Trade-off:** Achieved a highly optimized memory footprint of **45.18 MB (Beats 90.54%)**, but utilizing an extra string buffer results in an `O(N)` auxiliary space complexity instead of the strict constant space requested.
* **Key Learning:** Realized that this problem can be solved in true `O(1)` constant extra space by using two separate read and write pointers to modify the character array entirely in-place as frequencies are calculated.

### Day 9: Move Zeroes
* **Initial Thought:** Counted total zero values first, then initiated nested loops to manually bubble each encountered zero to the end of the array.
* **Trade-off:** Ran at `O(n²)` time complexity due to nested shifts, finishing at **117 ms (Beats 5.00%)**. It requires zero external memory structures, fulfilling the in-place target with `O(1)` space complexity.
* **Key Learning:** Learned that a two-pointer linear pass (`O(n)`) completely avoids nested looping. One pointer tracks the write location for non-zero numbers while a simple follow-up loop populates the remaining slots with trailing zeros to hit 1 ms (Beats ~100%).

### Day 10: Majority Element
* **Initial Thought:** Sorted the entire array so that identical elements group together, making the majority element automatically land at the exact middle index `nums[nums.length/2]`.
* **Trade-off:** Achieved an execution footprint of **6 ms (Beats 52.12%)** and **55.86 MB (Beats 18.39%)**. This approach requires a time complexity of `O(n log n)` due to the sorting step, along with `O(log n)` space performance for primitive sorting stacks.
* **Key Learning:** Discovered that sorting can be completely avoided. The problem can be optimized to a linear `O(n)` time complexity and a strict `O(1)` constant space complexity using the **Boyer-Moore Voting Algorithm**, which identifies the majority element via a single pass by balancing an active candidate variable against a counter.

### Day 11: Binary Search
* **Initial Thought:** Handled lookups via basic sequential linear iteration across the sequence.
* **Trade-off:** Achieved a runtime performance of **2 ms (Beats 2.84%)** and a low memory footprint of **47.97 MB (Beats 94.89%)**. This approach works at an optimal `O(log n)` time complexity while taking a strict `O(1)` auxiliary space complexity.
* **Key Learning:** Calculated safe middle indices via `lo + (hi - lo) / 2` to systematically avoid potential integer value overflow bugs.

### Day 12: Find First and Last Position of Element in Sorted Array
* **Initial Thought:** Used a primary binary search pass to verify the existence of the element, followed by two independent modified binary searches (Lower Bound and Upper Bound strategies) to pin down boundaries.
* **Trade-off:** Achieved an exceptional **0 ms runtime (Beats 100.00%)** and **48.11 MB memory usage (Beats 52.19%)**. Operates at an optimal `O(log n)` time complexity while relying on a constant space performance of `O(1)`.
* **Key Learning:** Learned how to modify classic binary search into **Lower Bound** (`arr[mid] >= x`) and **Upper Bound** (`arr[mid] > x`) variations to locate the exact starting and ending boundaries of a repeating target element in an array.

### Day 13: Peak Index in a Mountain Array
* **Initial Thought:** Realized the array behavior inherently scales up and then strictly declines, allowing us to find the peak boundary by checking middle neighbors.
* **Trade-off:** Achieved a flawless **0 ms runtime (Beats 100.00%)** and **80.32 MB memory usage (Beats 40.69%)**. Runs at an optimal `O(log n)` time complexity with `O(1)` auxiliary space overhead.
* **Key Learning:** Mastered localized slope checking in Binary Search. By evaluating whether `arr[mid]` is greater than its immediate neighbors, we can seamlessly decide whether to shift our bounds left or right without examining the full structure line-by-line.

### Day 14: Reverse Pairs
* **Initial Thought:** Evaluated a baseline brute-force approach looking over every index comparison to see if values match the target criteria.
* **Trade-off:** Achieved a fast performance of **42 ms (Beats 88.73%)** and a memory usage footprint of **60.94 MB (Beats 62.52%)**. This design solves the problem at an optimal `O(n log n)` time complexity while relying on an auxiliary extra space configuration of `O(n)` to drive recursion stacks.
* **Key Learning:** Mastered custom Divide & Conquer optimization by nesting a two-pointer evaluation stage right before the classic array reconstruction steps of a standard Merge Sort. Since partitioned subarrays are pre-sorted, hitting a match allows you to instantly increment your tracking index by the remaining block lengths without performing single step-by-step element evaluations.

### Day 15: Kth Largest Element in an Array
* **Initial Thought:** Implemented the QuickSelect algorithm (selection algorithm based on Quicksort partitioning) to locate the target element without sorting the entire array.
* **Trade-off:** Ended up with a slow performance of **2191 ms (Beats 5.42%)** and **79.70 MB memory usage (Beats 5.04%)**. While the average time complexity is `O(n)`, picking the first element as the pivot (`arr[lo]`) on near-sorted inputs drops the worst-case performance down to a punishing `O(n²)` time.
* **Key Learning:** Discovered that QuickSelect can efficiently bypass a full `O(n log n)` sort. However, to guarantee a fast, predictable `O(n)` linear time runtime, you must introduce a **randomized pivot selection** strategy or shuffle the array upfront to break sorted worst-case inputs.

### Day 16: Sqrt(x)
* **Initial Thought:** Implemented a Binary Search approach over the search space `[2, x / 2]` to find the integer square root instead of using a linear scan or a built-in exponent function.
* **Performance:** Achieved an optimized runtime of **1 ms (Beats 98.13%)** and **42.59 MB memory usage (Beats 61.93%)**. The algorithm efficiently narrows down the candidate range in logarithmic time.
* **Key Learning:** Learned how to safely prevent arithmetic integer overflow by casting the product (`mid * mid`) to a `long` before comparing it with `x`. Additionally, when an exact perfect square root does not exist, the `right` pointer naturally converges to the correct rounded-down floor integer at loop termination.


### Day 17: Palindrome Number
* **Initial Thought:** Implemented an iterative digit extraction approach by reversing the entire integer using modulo (`% 10`) and division (`/ 10`) operators, then comparing the reversed result with the original value.
* **Performance:** Achieved a runtime of **5 ms (Beats 81.46%)** and **45.68 MB memory usage (Beats 94.50%)**. The algorithm operates with a time complexity of O(log₁₀(N)) and space complexity of O(1).
* **Key Learning:** Reinforced handling of edge cases, such as immediately returning `false` for negative numbers since their negative sign prevents them from being palindromes. Also recognized the potential risk of integer overflow when reversing very large numbers, which can be mitigated by reversing only half of the digits or using a larger data type.



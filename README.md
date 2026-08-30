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


### Day 18: 3Sum Closest
* **Initial Thought:** Utilized a Sorting + Two-Pointer approach to find three integers that produce a sum closest to the given target. By sorting the array first, the window can be dynamically adjusted from both ends based on whether the current sum is smaller or larger than the target.
* **Performance:** Achieved a runtime of **16 ms (Beats 93.16%)** and **45.83 MB memory usage (Beats 14.76%)**. The algorithm operates with an efficient time complexity of O(N²) and a space complexity of O(1) auxiliary space.
* **Key Learning:** Learned how to effectively optimize multi-variable combination problems by fixing one element and using the two-pointer technique to reduce an O(N³) brute-force search down to O(N²). Implemented an early exit condition that immediately returns the sum if it perfectly matches the target, saving unnecessary computations.


### Day 19: Array Partition
* **Initial Thought:** Utilized a Counting Sort (Bucket Sort) approach to bypass the O(N log N) limitation of standard comparison sorting algorithms. By dynamically mapping the array boundaries based on the precise minimum and maximum elements, the numbers can be processed in a naturally sorted linear sequence.
* **Performance:** Achieved a runtime of **5 ms (Beats 99.86%)** and **47.36 MB memory usage (Beats 99.87%)**. The algorithm operates with a highly efficient linear time complexity of O(N) and an optimized auxiliary space complexity of O(N).
* **Key Learning:** Learned how to leverage strict element constraints to achieve true linear time performance using value frequency buckets. Implemented an alternating boolean flag logic to perfectly sum elements at even positions without the need to fully reconstruct or duplicate a sorted copy of the entire underlying array dataset.


### Day 20: Squares of a Sorted Array
* **Initial Thought:** Utilized a Two-Pointer approach to bypass the O(N log N) limitation of standard squaring and sorting algorithms. Since the input array is already sorted in non-decreasing order, the largest squared values are guaranteed to reside at the absolute boundaries (extreme negative values on the left or large positive values on the right), allowing for a systematic comparison.
* **Performance:** Achieved a runtime of **1 ms (Beats 100.00%)** and **47.36 MB memory usage (Beats 53.37%)**. The algorithm operates with a highly efficient linear time complexity of O(N) and an optimized auxiliary space complexity of O(1) beyond the output array.
* **Key Learning:** Mastered the concept of using convergent pointers to merge elements based on absolute magnitude from pre-sorted datasets. Implemented a reverse-filling strategy to populate the final output array from right to left, avoiding any secondary sorting passes or auxiliary element re-indexing overhead.


### Day 21: Relative Sort Array
* **Initial Thought:** Utilized a Counting Sort approach to bypass the O(N log N) limitation of comparison-based sorting algorithms. Since the problem constraints restrict the maximum element value to 1000, a fixed-size frequency array can efficiently record the occurrences of all elements in `arr1` and arrange them sequentially according to the relative order defined by `arr2`.
* **Performance:** Achieved a runtime of **0 ms (Beats 100.00%)** and **43.30 MB memory usage (Beats 96.25%)**. The algorithm operates with an optimal linear time complexity of O(N + M) and an optimized auxiliary space complexity of O(1) due to the fixed-size frequency bucket array.
* **Key Learning:** Mastered the concept of using frequency maps/bucket arrays for non-comparison linear sorting when input data ranges are strictly bounded. Implemented a deterministic two-phase population strategy—first satisfying custom relative ordering constraints, followed by an iterative sweeping pass to handle leftover elements in their natural ascending order.


### Day 22: Height Checker
* **Initial Thought:** Extended the Counting Sort (frequency array) philosophy from previous array-rearranging problems to bypass comparison-based sorting limitations. Since the student heights are strictly bounded between 1 and 100, an integer frequency array of size 101 can effortlessly track element counts, allowing the reconstruction of the ideal sorted alignment (`expected`) in linear time to identify positional mismatches.
* **Performance:** Achieved a runtime of **1 ms (Beats 92.50%)** and **43.17 MB memory usage (Beats 85.65%)**. The solution exhibits a linear time complexity of O(N + K) and an auxiliary space complexity of O(N) to store the expected sequence.
* **Key Learning:** Reinforced proficiency in using fixed-size frequency buckets to generate a non-comparison sorted sequence in linear time. Solidified understanding of positional comparison metrics by mapping the state of a dynamically reconstructed optimal array against the layout of the original input configurations.


### Day 23: Sorting the Sentence
* **Initial Thought:** Recognized that the 1-indexed positional marker appended to the end of each word determines its final location, making comparison-based sorting unnecessary. By splitting the shuffled string by spaces, extracting the numeric index from the last character of each substring, and stripping that number, the words can be placed directly into a pre-allocated string array at their correct positions in a single linear pass.
* **Performance:** Achieved a runtime of **0 ms (Beats 100.00%)** and **42.56 MB memory usage (Beats 91.35%)**. The solution exhibits a linear time complexity of O(N), where N is the total length of the string, and an auxiliary space complexity of O(N) to store the split words and reconstruct the final sentence.
* **Key Learning:** Reinforced proficiency in string manipulation techniques, specifically using character arithmetic (`word.charAt(n - 1) - '1'`) to map ASCII digits directly to zero-indexed array boundaries. Solidified understanding of the `String.join()` delimiter operation to efficiently assemble components back into a well-formed sentence without trailing whitespaces.


### Day 24: Check Divisibility by Digit Sum and Product
* **Initial Thought:** Recognized that the problem requires calculating both the sum and the product of the digits of a given number `n` to check for divisibility. By utilizing a standard mathematical digit-extraction loop with modulo (`% 10`) and integer division (`/ 10`), both metrics can be accumulated simultaneously in a single linear pass over the digits without the overhead of converting the number to a string.
* **Performance:** Achieved a runtime of **0 ms (Beats 100.00%)** and **42.17 MB memory usage (Beats 84.43%)**. The solution exhibits a logarithmic time complexity of O(log₁₀ N), where N is the value of the integer (proportional to its number of digits), and a constant auxiliary space complexity of O(1) since only a few primitive integer variables are utilized.
* **Key Learning:** Reinforced fundamental arithmetic digit processing techniques, avoiding costly type casting or string parsing operations. Solidified understanding of combining multiple cumulative calculations (summation and multiplication) inside a single iterative block for optimal execution performance.


### Day 25: Find Peak Element
* **Initial Thought:** Recognized that finding a peak element in an unsorted array within O(log n) time necessitates a binary search approach rather than a linear scan. By evaluating the middle element against its immediate neighbors (safely handling array boundaries as -∞), the search space can be confidently halved: if the right neighbor is larger, an upward slope guarantees a peak exists in the right half, otherwise a peak must lie to the left.
* **Performance:** Achieved a runtime of **0 ms (Beats 100.00%)** and **44.24 MB memory usage (Beats 38.36%)**. The solution exhibits a logarithmic time complexity of O(log n), where n is the number of elements in the array, and a constant auxiliary space complexity of O(1) since the search is performed iteratively in-place.
* **Key Learning:** Reinforced the application of binary search on unsorted data by leveraging local trends (slopes) rather than global sorted order. Solidified boundary condition handling to smoothly simulate virtual negative infinity elements outside the array indices without triggering out-of-bounds exceptions.


### Day 26: Count Primes
* **Initial Thought:** Identified that counting all prime numbers strictly less than a given integer `n` efficiently requires a specialized mathematical approach like the Sieve of Eratosthenes rather than checking each number individually. By initializing a boolean array to track composite status up to `n`, we can iteratively mark off multiples of each discovered prime starting from 2 up to \(\sqrt{n}\), leaving only prime indicators intact.
* **Performance:** Achieved a runtime of **619 ms (Beats 11.94%)** and **79.80 MB memory usage (Beats 8.57%)**. The solution exhibits a time complexity of O(n log log n), which operates far faster than naive division, and an auxiliary space complexity of O(n) due to the boolean tracking array.
* **Key Learning:** Mastered the implementation of the classic Sieve of Eratosthenes algorithm for sub-linear primality counting. Reinforced the importance of analyzing edge case constraints carefully—specifically managing the "strictly less than" rule, which dictates that inputs like `n = 2` must return 0 because no primes exist below it.


### Day 27: Valid Triangle Number
* **Initial Thought:** Recognized that determining the number of valid triplets that can form a triangle requires the triangle inequality condition $a + b > c$ to hold true. By sorting the array in ascending order, we can fix the largest side from the end of the array and use a two-pointer approach to find valid pairs for the remaining two sides, avoiding an expensive $O(n^3)$ brute-force check.
* **Performance:** Achieved a runtime of **27 ms (Beats 90.92%)** and **45.74 MB memory usage (Beats 40.61%)**. The solution exhibits a time complexity of $O(n^2)$ due to the nested loop structure combining a fixed largest side with a linear two-pointer scan, and a space complexity of $O(\log n)$ inherent to the sorting implementation.
* **Key Learning:** Learned how sorting a dataset can transform a three-variable combination problem into an optimized two-pointer search. Understood how calculating `count += (hi - lo)` instantly accounts for all intermediate valid choices when a pair satisfies the triangle condition, maximizing efficiency.


  ### Day 28: Maximum Subarray
* **Initial Thought:** Identified that finding the contiguous subarray with the largest sum can be optimized using Kadane's Algorithm instead of evaluating all possible subarrays via brute force. By iterating through the array while maintaining a running local maximum, we can dynamically decide whether to extend the current subarray or start a fresh one at each element.
* **Performance:** Achieved a runtime of **1 ms (Beats 99.94%)** and **77.22 MB memory usage (Beats 48.99%)**. The solution exhibits a linear time complexity of $O(n)$ as it scans the array exactly once, and a constant space complexity of $O(1)$ since it only utilizes a few primitive tracking variables.
* **Key Learning:** Mastered the core concept of dynamic programming through Kadane's Algorithm. Understood how local choices—determining whether a single element is worth more on its own than combined with the preceding sequence—can chain together to solve a global optimization challenge with maximum efficiency.


### Day 29: Palindrome Pairs
* **Initial Thought:** Recognized that evaluating every possible pair of words would take an inefficient $O(n^2 \cdot k)$ brute-force approach. Instead, optimized the solution using a HashMap to store the indices of all unique strings. By iterating through each word and splitting it into all possible `left` and `right` substrings, we can check if one part forms a palindrome while the reverse of the remaining part exists as a valid word in our map.
* **Performance:** Achieved a runtime of **1370 ms (Beats 24.21%)** and **63.04 MB memory usage (Beats 16.47%)**. The solution achieves a time complexity of $O(n \cdot k^2)$, where $n$ is the total number of words and $k$ is the maximum length of a word, due to the substring extractions and palindrome validations. The space complexity is $O(n \cdot k)$ to store the dictionary map.
* **Key Learning:** Enhanced understanding of string manipulation, hashing, and boundary edge cases (such as handling empty strings `""` and single-character inputs). Learned how breaking a complex string matching problem into structured substring components enables an efficient look-up pattern rather than relying on nested iterations.


  ### Day 30: Plus One
* **Initial Thought:** Recognized that converting the array directly into a standard integer or long would trigger overflow errors for large input bounds (up to 100 digits). Instead, implemented an in-place simulation of schoolbook addition, iterating backward from the least significant digit. If a digit is less than 9, it is simply incremented; otherwise, it rolls over to 0 to propagate the carry.
* **Performance:** Achieved a runtime of **0 ms (Beats 100.00%)** and **41.25 MB memory usage (Beats 88.50%)**. The solution achieves a time complexity of $O(n)$, where $n$ is the length of the array, since it traverses the digits at most once. The space complexity is $O(1)$ for in-place modifications, scaling to $O(n)$ only in the worst-case scenario where an all-9s array requires allocating a new array of size $n + 1$.
* **Key Learning:** Deepened understanding of handling carry-propagation logic without relying on built-in type conversions. Mastered array boundary edge cases, specifically learning how to efficiently handle structural growth (like turning 99 into 100) by utilizing Java's default zero-initialization feature when instantiating a larger array.


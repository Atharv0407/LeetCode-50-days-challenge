# 🚀 50 Days of LeetCode Challenge

Welcome to my data structures and algorithms repository! I am embarking on a dedicated 50-Day Coding Challenge to strengthen my problem-solving skills, master core computer science concepts, and build daily consistency in software engineering.

🎯 **Challenge Goals**
* **Consistency:** Solve at least one algorithmic problem every single day for 50 days.
* **Optimization:** Progress from brute-force solutions to optimal time/space complexities.
* **Documentation:** Track and articulate my learning journey publicly to help others and receive feedback.

🛠️ **Tech Stack**
* **Language:** Java ☕
* **Platform:** LeetCode

💡 **Key Takeaway Log**

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

### Day 8: String Compression
* **Initial Thought:** Utilized a `StringBuilder` to sequentially collect the compressed characters and their respective group frequencies, then overwrote the initial array.
* **Trade-off:** Achieved a highly optimized memory footprint of **45.18 MB (Beats 90.54%)**, but utilizing an extra string buffer results in an `O(N)` auxiliary space complexity instead of the strict constant space requested.
* **Key Learning:** Realized that this problem can be solved in true `O(1)` constant extra space by using two separate read and write pointers to modify the character array entirely in-place as frequencies are calculated.

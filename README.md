🚀 50 Days of LeetCode Challenge
Welcome to my data structures and algorithms repository! I am embarking on a dedicated 50-Day Coding Challenge to strengthen my problem-solving skills, master core computer science concepts, and build daily consistency in software engineering.

🎯 Challenge Goals
* **Consistency:** Solve at least one algorithmic problem every single day for 50 days.
* **Optimization:** Progress from brute-force solutions to optimal time/space complexities.
* **Documentation:** Track and articulate my learning journey publicly to help others and receive feedback.

🛠️ Tech Stack
* **Language:** Java ☕
* **Platform:** LeetCode

💡 Key Takeaway Log

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

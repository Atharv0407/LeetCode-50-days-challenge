Day 3: Valid Anagram
Initial Thought: Converted both strings to character arrays, sorted them using `Arrays.sort()`, and checked if they were identical.
Trade-off: Extremely clean and readable solution, but requires O(n log n) time complexity due to the sorting step and O(n) space to store the arrays.
Key Learning: Discovered that this can be further optimized to O(n) time and O(1) space by using a fixed-size frequency array (size 26) to count character occurrences instead of sorting.


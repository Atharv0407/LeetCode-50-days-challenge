class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] count = new int[101]; 
        for (int i = 0; i <= n - 1; i++) {
            count[heights[i]]++;
        }    
        int[] expected = new int[n];
        int index = 0;
        for (int h = 1; h <= 100; h++) {
            while (count[h] > 0) {
                expected[index] = h;
                index++;
                count[h]--;
            }
        }      
        int countMismatches = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (heights[i] != expected[i]) {
                countMismatches++;
            }
        }
        return countMismatches;
    }
}

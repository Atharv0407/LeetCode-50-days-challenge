class Solution {
    public int arrayPairSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        int[] freq = new int[max - min + 1];
        for (int num : nums) {
            freq[num - min]++;
        }
        int maxSum = 0;
        boolean borrow = false; 
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                if (!borrow) {
                    maxSum += (i + min);
                }
                borrow = !borrow;
                freq[i]--;
            }
        }
        
        return maxSum;
    }
}

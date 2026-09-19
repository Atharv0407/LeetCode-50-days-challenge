class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int totalCandies = 1;
        int up = 0;
        int down = 0;
        int peak = 0;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                up++;
                down = 0;
                peak = up;
                totalCandies += 1 + up;
            } else if (ratings[i] == ratings[i - 1]) {
                up = 0;
                down = 0;
                peak = 0;
                totalCandies += 1;
            } else {
                down++;
                up = 0;
                totalCandies += down;
                if (down > peak)  totalCandies += 1;
            }
        }  
        return totalCandies;
    }
}

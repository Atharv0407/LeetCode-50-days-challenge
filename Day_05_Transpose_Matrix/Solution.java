class Solution {
    public int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] transpose = new int[n][m];
         System.out.println();
          for (int j = 0; j< n; j++) {
            for (int i = 0; i < m; i++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
        
    }
}

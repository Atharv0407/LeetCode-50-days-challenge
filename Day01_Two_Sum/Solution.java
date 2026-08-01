class Solution {
    public int[] twoSum(int[] arr, int x) {
        int[] ans = new int[2];
        int n = arr.length;
        for(int i = 0; i <= n - 1; i++){
            for(int j = i + 1; j <= n - 1; j++){
                if(arr[i] + arr[j] == x){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}

class Solution {
    static int ans;
     public static void swap(int[] arr , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int lo,int hi){
        int pivot = arr[lo];
        int pivotIdx = lo;
        int smallCount = 0;
        for (int i = lo+1; i <=hi; i++) {
            if(arr[i]<=pivot){
                smallCount++;
            }
        }
        int correctIdx = pivotIdx + smallCount;
        swap(arr,pivotIdx,correctIdx);
        int i = lo;
        int j = hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot){
                i++;
            }
            else if (arr[j]>pivot) {
                j--;
            }
            else if (arr[i]>pivot && arr[j]<=pivot) {
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quickSelect(int[] arr,int lo,int hi,int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo == k-1){
                ans = arr[lo];
            }
        }
        int idx = partition(arr,lo,hi);
        if(idx==k-1){
            ans = arr[idx];
        }
        else if(idx>k-1){
            quickSelect(arr,lo,idx-1,k);
        }
        else {
            quickSelect(arr,idx+1,hi,k);
        }
    }
    public int findKthLargest(int[] arr, int k) {
        ans = -1;
        int n =arr.length;
        quickSelect(arr,0,n-1,n-k+1);
        return ans;
    }
}

class Solution {
    public int search(int[] arr, int x) {
        int n =arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid  = lo+(hi-lo)/2;
            if(arr[mid]<x){
                lo=lo+1;
            }
            else if(arr[mid]>x){
                hi=hi-1;
            }
            else if (arr[mid]==x){
                return mid;
            }    
        }
        return -1;
    }
}

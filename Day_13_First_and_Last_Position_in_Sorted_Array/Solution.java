class Solution {
    public int[] searchRange(int[] arr, int x) {
       int[] ans = {-1,-1};
       int n = arr.length; 
        int lo = 0;
        int hi = n-1;
        boolean flag = false;
        //checking element is present or not
        while(lo<=hi){
            int mid  = lo+(hi-lo)/2;
            if(arr[mid]<x){
                lo=mid+1;
            }
            else if(arr[mid]>x){
                hi=mid-1;
            }
            else if (arr[mid]==x){
                flag=true;
                break;
            }
        }
        if(flag==false){
            return ans;
        }
        lo=0;
        hi=n-1;
        int lb=n;
        //finding firstPosition using lower bound
         while(lo<=hi){
            int mid  = lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb = Math.min(lb,mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        ans[0] = lb;
        lo=0;
        hi=n-1;
        int ub=n;
         //finding LasttPosition using upper bound
         while(lo<=hi){
            int mid  = lo+(hi-lo)/2;
            if(arr[mid]>x){
                ub = Math.min(ub,mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        ans[1] = ub-1;
        return ans;
    }
}

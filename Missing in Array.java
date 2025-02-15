class Solution {
    int missingNumber(int arr[]) {
        // code here
        long l=arr.length+1;
        long res=0;
        for(int i:arr){
            res+=i;
        }
        return (int)(((l*(l+1))/2)-res);
        
    }
}

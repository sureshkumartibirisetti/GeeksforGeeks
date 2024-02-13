

//User function Template for Java

class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int count=0;
        for (int i:arr){
            if (i==0){
                count++;
            }
        }
        return count;
        
    }

}

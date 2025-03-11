class Solution {
    static boolean isPerfectNumber(int n) {
        // code here
        int res=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int a=n/i;
                res+=a;
                res+=i;
            }
        }
        return (res+1)==n;
    }
};

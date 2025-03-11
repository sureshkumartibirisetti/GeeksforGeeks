class Solution{
    static int countFactors(int N) {
        //code here
        int res=0;
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i==0 && i!=Math.sqrt(N)){
                res+=2;
            }else if(N%i==0 && i==Math.sqrt(N)){
                res+=1;
            }
        }
        return res;
    }
}

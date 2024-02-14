

//User function Template for Java

class Solution
{
        
    long power(int N,int R)
    {
         if(R==0){
            return 1;
        }
        if(R%2==0){
            long res=power(N,R/2);
            return (res*res)%1000000007;
        }
        else{
            long res=power(N,R-1);
            return (res*N)%1000000007;
        }
    }
}
//11

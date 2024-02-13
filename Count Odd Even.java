

// User function Template for Java

/*Class Geeks with countOddEven() as its member function
* a : input array
* n : size of array
*/
class Geeks {
    static void countOddEven(int a[], int n) {

        int countOdd = 0;
        int countEven = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                countEven++;
            }
            else if(a[i]%2!=0){
                countOdd++;
            }
        }
        System.out.print(countOdd +" " +countEven);
    }
}

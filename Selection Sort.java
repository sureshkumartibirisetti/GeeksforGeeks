class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            int temp=0;
            int a=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(a>arr[j]){
                    a=arr[j];
                    temp=j;
                }
            }
            if(temp!=0) {
                int temp1 = arr[temp];
                arr[temp] = arr[i];
                arr[i] = temp1;
            }
        }
    }
}

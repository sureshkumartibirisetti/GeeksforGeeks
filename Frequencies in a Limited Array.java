class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=arr.length;i++){
            if(map.containsKey(i)){
                al.add(map.get(i));
            }else{
                al.add(0);
            }
        }
        return al;
    }
}

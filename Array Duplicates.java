class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            int j=hm.get(i);
            if(j>1){
                al.add(i);
            }
        }
        return al;
    }
}

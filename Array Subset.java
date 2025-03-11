class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:b){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:map1.keySet()){
            if(map.containsKey(i)){
                if(map1.get(i)<=map.get(i)){
                    continue;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
        
    }
}

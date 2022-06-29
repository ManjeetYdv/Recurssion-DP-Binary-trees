class Solution {

    List<List<Integer>> res;
    
    public void func(int[] arr, int index , List<Integer> list){
        
        if(index==arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        list.add(arr[index]);
        func(arr , index+1  , list);
        list.remove(list.size()-1);
        
        func(arr , index+1 ,list);
        
        
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        res = new ArrayList<>();
        Arrays.sort(nums);
        
        func(nums  ,0 , new ArrayList<>());
        
         Set<List<Integer>> set = new HashSet<>();

       for(List<Integer> r : res){
            set.add(r);
        }
        
         List<List<Integer>> res2 = new ArrayList<>();
         for(List<Integer> r : set){
            res2.add(r);
        }
        
        return res2;
        
        
    }
}

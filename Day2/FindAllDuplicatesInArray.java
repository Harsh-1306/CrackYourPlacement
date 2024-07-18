public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            if(map.get(num)==null)
            {
                map.put(num,1);
            }
            else
            {
                map.put(num,map.get(num)+1);
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry: map.entrySet())
        {
            if(entry.getValue()>1)
            {
               ans.add(entry.getKey());
            }
        }
        return ans;
        
}
}


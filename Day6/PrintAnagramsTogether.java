class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
                Map<String,List<String>>map=new HashMap<>();
        for(String s:string_list)
        {
            char[]arr=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

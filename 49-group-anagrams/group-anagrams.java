class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String x: strs){
            char []temp = x.toCharArray();
            Arrays.sort(temp);
            String sortedKey = new String(temp);

            if(!map.containsKey(sortedKey)){
                map.put(sortedKey, new ArrayList<>());
            }

            map.get(sortedKey).add(x);


            

        }
        
        return new ArrayList<>(map.values());
    }
}
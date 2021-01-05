class Solution {
    public String longestCommonPrefix(String[] strs) {
    
        Map<Integer, ArrayList<String>> mapWords = new HashMap<>();
    
        for (int i = 0; i < strs.length; i++) {
            int key = strs[i].length();
            // making sure ArrayList exists
            mapWords.putIfAbsent(key, new ArrayList<String>());
            mapWords.get(key).add(strs[i]);
        }
        
        mapWords.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());  
        });
        
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> ht1 = new Hashtable<>();

        for (char c : s.toCharArray()){
            ht1.put(c, ht1.getOrDefault(c, 0)+1);
        }

        Map<Character, Integer> ht2 = new Hashtable<>();

        for (char d : t.toCharArray()){
            ht2.put(d, ht2.getOrDefault(d, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: ht1.entrySet() ){
            if (!ht2.containsKey(entry.getKey()) || !ht2.get(entry.getKey()).equals(entry.getValue())) {
           return false;
       
    }
        }
        return true;
    }
}

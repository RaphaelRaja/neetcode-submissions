class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> ht1 = new Hashtable<>();

        for (char c : s.toCharArray()){
            ht1.put(c, ht1.getOrDefault(c, 0)+1);
        }

        for (char d : t.toCharArray()){
            if(ht1.containsKey(d)){
                ht1.put(d, ht1.getOrDefault(d, 0)-1);
            }
            else{
                ht1.put(d, ht1.getOrDefault(d, 0)+1);
            }
        }

        for(Map.Entry<Character, Integer> entry: ht1.entrySet() ){
            if (!ht1.get(entry.getKey()).equals(0)) {
                return false;
           }
        }
        return true;
    }
}

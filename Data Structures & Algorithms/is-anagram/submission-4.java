class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return false;}

        Map<Character, Integer> used_S = new HashMap();
        Map<Character, Integer> used_T = new HashMap();
        
        for (int i = 0; i < s.length(); i++) {
            used_S.put(s.charAt(i), used_S.getOrDefault(s.charAt(i), 0) + 1);
            used_T.put(t.charAt(i), used_T.getOrDefault(t.charAt(i), 0) + 1);
        }

        return used_S.equals(used_T); 
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return false;}

        char [] str_1 = s.toCharArray();
        char [] str_2 = t.toCharArray();

        Arrays.sort(str_1);
        Arrays.sort(str_2);
        
        return Arrays.equals(str_1, str_2);
    }
}

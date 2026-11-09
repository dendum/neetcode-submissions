class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            int [] chars = new int [26];

            for (int j = 0; j < strs[i].length(); j++) {
                char c = strs[i].charAt(j);
                chars[c - 'a']++;
            }

            String key = Arrays.toString(chars);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(strs[i]);
        }

        return new ArrayList<>(res.values());
    }
}

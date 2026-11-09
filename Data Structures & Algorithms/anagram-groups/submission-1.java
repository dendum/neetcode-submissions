class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            res.putIfAbsent(key, new ArrayList());
            res.get(key).add(strs[i]);
        }

        return new ArrayList<>(res.values());
    }
}

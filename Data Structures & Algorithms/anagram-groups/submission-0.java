class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int pointer = 0;
        HashMap<String, List<String>> anagrams = new HashMap<>();
         
        for(int i = 0; i < strs.length; i++){
            anagrams.computeIfAbsent(evalString(strs[i]), k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(anagrams.values());
    }

    private String evalString(String x){

        int[] letters = new int[26];
        char[] xArr = x.toCharArray();

        Arrays.sort(xArr);

        return new String(xArr);
    }
}

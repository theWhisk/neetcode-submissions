class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(char c : sArr){
            sCount.merge(c, 1, Integer::sum);
        }

        for(char c : tArr){
            tCount.merge(c, 1, Integer::sum);
        }

        return sCount.equals(tCount) ? true : false;
    }
}

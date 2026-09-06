class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sArr = s.toCharArray();
        int[] count = new int[128];
        int l = 0, maxLen = 0;

        for(int r = 0; r < s.length(); r++){ 
            count[sArr[r]]++;

            while(count[sArr[r]] > 1 && l < r){
                count[sArr[l]]--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}

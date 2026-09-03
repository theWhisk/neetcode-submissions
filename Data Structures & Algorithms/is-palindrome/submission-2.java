class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length-1;

        while(l < r){
            while(!Character.isLetterOrDigit(chars[l]) && l < r){
                l++;
            } 
            while(!Character.isLetterOrDigit(chars[r]) && l < r){
                r--;
            }

            if(Character.toLowerCase(chars[l])!=Character.toLowerCase(chars[r])) return false;
            l++;
            r--;
        }

        return true;
    }
}

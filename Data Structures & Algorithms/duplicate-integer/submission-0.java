class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> observed = new HashMap<>();

        for(int num:nums){
            if(observed.containsKey(num)){
                return true;
            }
            observed.put(num, true);
        }

        return false;
    }
}
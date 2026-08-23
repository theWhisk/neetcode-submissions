class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> observed = new HashSet<>();

        for(int num:nums){
            if(observed.contains(num)){
                return true;
            }
            observed.add(num);
        }

        return false;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target){ 
        HashMap<Integer, Integer> seen = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(seen.containsKey(need)){
                ans[0] = seen.get(need);
                ans[1] = i;
                break;
            }
            seen.put(nums[i], i);
        }
        

        return ans;
    }
}

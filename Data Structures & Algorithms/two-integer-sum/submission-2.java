class Solution {
    public int[] twoSum(int[] nums, int target){ 
        
        int[] ans = new int[2];

        for(int l = 0; l < nums.length-1; l++){
            int r = l+1;
            int sum = nums[l] + nums[r];

            while(sum != target && r < nums.length-1){
                r++;
                sum = nums[l] + nums[r];
            }

            if(sum == target){
                ans[0] = l;
                ans[1] = r;
                break;
            }
        }
        

        return ans;
    }
}

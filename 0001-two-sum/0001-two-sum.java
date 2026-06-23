class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length-1; i++){
            for(int j =i+1; j< nums.length; j++){
                
                    if((nums[i]+nums[j])==target){
                        int[] arr = { i, j};
                        return arr;
                    }
                
            }
        }
        int[] ary = {};
        return ary;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
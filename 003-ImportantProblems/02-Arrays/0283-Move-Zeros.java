// LeetCode 0283 - Move Zeros
// Solved on: 6 January 2026 
// Approach: Two-pointer (in-place swapping)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        Arrays.toString(nums);
    }
}

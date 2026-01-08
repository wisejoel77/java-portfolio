// LeetCode 0268 - Missing Number
// Solved on: 5 January 2026 
// Approach: Sorting + index comparison
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==nums[i])
                count++;
            else {
                return i;
            }
        }
        return count;
    }
}

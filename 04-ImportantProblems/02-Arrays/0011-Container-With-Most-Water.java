// LeetCode 0011 - Container With Most Water
// Solved on: 8 January 2026
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length-1;
        while(left < right){
            int length = right - left;
            int h = Math.min(height[left], height[right]);
            int water = length * h;
            if(max < water){
                max = water;
            }
            if(height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}

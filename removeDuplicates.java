class Solution {
    public void removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] nums = {}
    }
}

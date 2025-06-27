class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long sum = 0, maxSum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            sum += nums[end];
     
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
        }
        return maxSum;
    }
}
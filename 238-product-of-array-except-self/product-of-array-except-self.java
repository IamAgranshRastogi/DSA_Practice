class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int numspro[] = new int[n];
        Arrays.fill(numspro,1);
        for(int i=0; i<n; i++) {
            numspro[i] = prefix; 
            prefix *= nums[i]; 
        }
        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            numspro[i] *= suffix;
            suffix *= nums[i]; 
        }
        return numspro;
    }
}
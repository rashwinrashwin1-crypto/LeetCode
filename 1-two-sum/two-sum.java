class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int arr[] = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) {
                int temp = nums[i] + nums[j];
                if (temp == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
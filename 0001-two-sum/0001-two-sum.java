// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//       for(int i=0;i<nums.lenght;i++)
//       {
//           for(int j=i+1;j<nums.lenght;j++)
//           {
//               if(nums[j]==target-num[i])
//               {
//                   return new int[]{i,j};
//               }
//           }
//       }
//         return null;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
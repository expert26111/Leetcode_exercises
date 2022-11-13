public class TwoSums 
{
   


    public static void main(String[] args)
    {
          int[] nums = {2,7,11,15};
          int target = 9; 

          int[] nums2 = {3,2,4};
          int target2 = 6;

          int[] nums3 = {3,3};
          int target3 = 6;

          int[] indexes = twoSum(nums,target);
          if(indexes != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes[0],indexes[1]);
          }


          int[] indexes2 = twoSum(nums2,target2);
          if(indexes2 != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes2[0],indexes2[1]);
          }

          int[] indexes3 = twoSum(nums3,target3);
          if(indexes3 != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes3[0],indexes3[1]);
          }
    }

    public static int[] twoSum(int[] nums, int target) 
    {
        for ( int index = 0; index <= nums.length-2;index++)
        {
            for( int in = index + 1 ; in <= nums.length-1;in++)
            {
                if(nums[index]+nums[in] == target)
                {
                    int[] indexes_that_match_targer = {index, in};
                    return indexes_that_match_targer;
                }
            }
        }
        return null;

    }
}

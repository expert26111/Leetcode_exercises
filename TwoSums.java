import java.util.HashMap;
import java.util.Map;

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
          indexes = twoSums_with_HashMap(nums,target);
          if(indexes != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes[0],indexes[1]);
          }
        
          indexes = twoSums_with_HashMap_One_For_Loop(nums,target);
          if(indexes != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes[0],indexes[1]);
          }


          int[] indexes2 = twoSum(nums2,target2);
          if(indexes2 != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes2[0],indexes2[1]);
          }
          indexes2 = twoSums_with_HashMap(nums2,target2);
          if(indexes2 != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes2[0],indexes2[1]);
          }
          indexes2 = twoSums_with_HashMap_One_For_Loop(nums2,target2);
          if(indexes2 != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes2[0],indexes2[1]);
          }


          int[] indexes3 = twoSum(nums3,target3);
          if(indexes3 != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes3[0],indexes3[1]);
          }
          indexes3 = twoSums_with_HashMap(nums3,target3);
          if(indexes3 != null)
          {
            System.out.printf("The indexes are:  [%d,%d] !%n", indexes3[0],indexes3[1]);
          }
          indexes3 = twoSums_with_HashMap_One_For_Loop(nums3,target3);
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
                if(nums[index]+nums[in] == target) // target - nums[in] = nums[index] 
                {
                    //int[] indexes_that_match_targer = {index, in};
                    //return indexes_that_match_targer;
                    return new int[] {index,in};
                }
            }
        }
        return null;
    }

    public static int[] twoSums_with_HashMap(int[] nums, int target)
    {
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for ( int index = 0; index <= nums.length-1;index++)
            {
                 map.put(nums[index],index);
            }   
            for ( int index = 0; index <= nums.length-1;index++ )
            {
                int complement = target - nums[index];
                if( map.containsKey(complement) &&  map.get(complement) != index)
                {
                    return new int[] { index,map.get(complement) };
                }
            }

            return null;
    }

    public static int[] twoSums_with_HashMap_One_For_Loop(int[] nums, int target)
    {
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for ( int index = 0; index <= nums.length-1;index++)
            {
                 int complement = target - nums[index];
                 if(map.containsKey(complement))
                 {
                    return new int[] { map.get(complement),index };
                 }
                 map.put(nums[index],index);
            }   
            return null;
    }



}

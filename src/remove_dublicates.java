import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class remove_dublicates {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int maxCount = 0;
        int maxItem = nums[i];

        while(i<nums.length-1){
            int item = nums[i];
            int count = 1;
            while(i<nums.length && item==nums[i]){
                count++;
                i++;
            }
            if(count>maxCount){
                maxCount = count;
                maxItem = item;
            }
            i=i++;
        }


        return maxItem;


    }
}

import java.util.Arrays;

public class remove_duplicates {
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

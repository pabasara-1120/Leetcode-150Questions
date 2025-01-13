public class sorted_squares {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] squared = new int[n];
        int i = 0; int j=n-1; int k = n-1;
        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left>right){
                squared[k] = left;
                k--;i++;
            }
            else{
                squared[k] = right;
                k--;j--;
            }
        }

        return squared;

    }
}

//naive approach is you can take the absolute value and sort the array and then take the squared value;

public class rotate {
    public void rotate(int[] nums, int k) {
        int[] extras = new int[k];
        int n = nums.length;
        int j=0;
        if(k>n){
            k=k%n;
        }
        for(int i = n-k;i<n;i++){
            extras[j] = nums[i];
            j++;
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int m=0;m<k;m++){
            nums[m]=extras[m];
        }



    }
}

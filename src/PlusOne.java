public class PlusOne {

        public int[] plusOne(int[] digits) {
            int n = digits.length;
            String s="";
            for (int j : digits) {
                s += j;
            }
            int carry = 1;
            StringBuilder result = new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                int digit = s.charAt(i)-'0';
                int sum = digit+carry;
                result.append(sum%10);
                carry = sum/10;
            }
            if(carry>0){
                result.append(carry);
            }

            String sum = result.reverse().toString();
            int[] sumArray = new int[sum.length()];
            for(int i=0;i<sumArray.length;i++){
                sumArray[i] = sum.charAt(i)-'0';
            }
            return sumArray;

        }

}

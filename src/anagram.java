import java.util.Arrays;

public class anagram {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        int n = sArray.length;
        int m = tArray.length;
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            if(sArray[i] != tArray[i]){
                return false;
            }
        }
        return true;
    }
}

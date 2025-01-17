import java.util.Arrays;

public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        char[] ransom = ransomNote.toCharArray();
        Arrays.sort(ransom);
        char[] magaz = magazine.toCharArray();
        Arrays.sort(magaz);
        int penalty = magazine.length()-ransomNote.length();
        int count =0;
        int i=0;int j=0;
        while(count<=penalty && i<magaz.length && j<ransom.length){
            if(magaz[i]!=ransom[j]){
                i++;
                count++;
                System.out.println(count);
            }
            else {
                i++;j++;
            }
        }
        if(count>penalty){
            return false;
        }
        return true;

    }
}

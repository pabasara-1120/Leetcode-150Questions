public class subseq {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int j = 0;
        int n = t.length();
        for(int i=0;i<n;i++){
            if(j<m && t.charAt(i)==s.charAt(j)){
                j++;
            }
        }

        return j == m;
    }
}

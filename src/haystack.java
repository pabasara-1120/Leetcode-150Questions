public class haystack {

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m  = needle.length();
        int j=0;
        int i=0;
        boolean flag = false;
        while(i<n){
            if(haystack.charAt(i) == needle.charAt(j)){
                int start = i;
                i++;j++;

                while(j<m && i<n && haystack.charAt(i)==needle.charAt(j) ){
                    i++;j++;

                }
                System.out.println(j);
                if(j==m){
                    return start;
                }else{
                    j=0;
                    i=start+1;
                }

            }else{
                i++;
            }


        }

        return -1;
    }

}

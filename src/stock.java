public class stock {

    public boolean isPalindrome(String s) {
        StringBuilder lowercase = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Check if the character is a letter
                lowercase.append(Character.toLowerCase(c)); // Convert to lowercase and append
            }
        }
        String string = lowercase.toString();
        System.out.println(string);
        if(string.equals(reverse(string))){
            return true;
        }
        return false;


    }

    private static String reverse(String s){
        String reversed = "";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
        }
        return reversed;
    }
}

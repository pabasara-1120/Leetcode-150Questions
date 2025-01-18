import java.util.HashMap;

class Solution {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> reverseMap = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            Character mappedChar = map.get(s.charAt(i));
            if(mappedChar!=null){
                if(mappedChar!=t.charAt(i)){
                    return false;
                }
            }else {
                Character mapping = reverseMap.get(t.charAt(i));
                if(mapping!=null){
                    if(mapping!=s.charAt(i)){
                        return false;
                    }
                }
                else{
                    map.put(s.charAt(i),t.charAt(i));
                    reverseMap.put(t.charAt(i),s.charAt(i));
                }

            }
        }
        return true;

    }

}
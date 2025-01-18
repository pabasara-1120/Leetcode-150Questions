import java.util.HashMap;

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> reverseMap = new HashMap<>();
        HashMap<Character,String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<words.length;i++){
            String mappedString = map.get(pattern.charAt(i));
            if(mappedString!=null){
                if(!mappedString.equals(words[i])){
                    return false;
                }
            }
            else{
                Character mappedChar = reverseMap.get(words[i]);
                if(mappedChar!=null){
                    if(mappedChar!=pattern.charAt(i)){
                        return false;
                    }
                }else {
                    map.put(pattern.charAt(i),words[i]);
                    reverseMap.put(words[i],pattern.charAt(i));
                }
            }
        }
        return true;
    }
}

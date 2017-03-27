public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        
        char patternArray[] = pattern.toCharArray();
        String strArray[] = str.split(" ");
        Map<Character, String> hashMap = new HashMap<Character, String>();
        if(patternArray.length != strArray.length){
            return false;
        }
        for(int i=0 ; i< patternArray.length; i++){
            if(hashMap.containsKey(patternArray[i])){
                String result = hashMap.get(patternArray[i]);
               
                if(!result.equals(strArray[i])){
                    return false;
                }
            }
            else{
                    for(int j=0; j <i;j++){
                        if(strArray[i].equals(strArray[j])){
                            return false;
                        }
                    }
                    hashMap.put(patternArray[i], strArray[i]);
                }
        }
        return true;
        
    }
}
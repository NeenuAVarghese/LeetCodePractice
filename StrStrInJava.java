public class StrStrInJava {
    public int strStr(String haystack, String needle) {
        
        if(haystack==null || needle==null){
            return 0;
        }
        int hayLen = haystack.length();
        int needleLen = needle.length();
        
        if(hayLen < needleLen){
            return -1;
        }

        if(needleLen == 0){
            return 0;
        }
        for(int i = 0;i <=hayLen - needleLen;i++){
           
            if(haystack.charAt(i) == needle.charAt(0)){
               
                int j = 0;
                for(; j < needleLen; j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                }
                
                if(j == needleLen){
                    return i;
                }
            }
        }
        return -1;
    }
}
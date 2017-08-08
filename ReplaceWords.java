/*
In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.

You need to output the sentence after the replacement.

Example 1:
Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
*/


public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        if(dict == null || dict.size() == 0){
            return sentence;
        }
        
        HashSet<String> set = new HashSet<String>();
        
        for(String word : dict){
            set.add(word);
        }
        
        String[] sentenceArr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String word: sentenceArr){
            String pattern  = "";
            for(int i=1; i<=word.length(); i++){
                pattern = word.substring(0, i);
                if(set.contains(pattern)){
                    break;
                }
            }
            sb.append(" " + pattern);
        }
        
        return sb.deleteCharAt(0).toString();
        
    }
}
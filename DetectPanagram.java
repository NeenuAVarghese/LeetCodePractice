//"Hello World!!!"
//"Now Is the time for all good men to come"
//""
//"The quick brown fox jumps over the lazy dog"


public class DetectPanagram{

	static String detectPanagram(String inputStr){
		int[] alphaDetect = new int[26];

		if(inputStr.length() == 0){
			return "abcdefghijklmnopqrstuvwxyz";
		}

		inputStr = inputStr.toLowerCase();

		for(int i=0; i<inputStr.length(); i++){

			int result = inputStr.charAt(i) - 'a'; // b 98 - 97  
			if(result >= 0 && result <= 25){
				alphaDetect[result] += 1;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<26; i++){
			if(alphaDetect[i] == 0){
				char alpha = (char)(i+97);
				sb.append(alpha);
			}
		}

		return sb.toString();
	}



	public static void main(String args[]){
		String[] inputArray = {"Hello World!!!", "Now Is the time for all good men to come", "", "The quick brown fox jumps over the lazy dog"};

		for(int i=0; i<inputArray.length;i++){
			System.out.println(inputArray[i] + ":    "+detectPanagram(inputArray[i]));
		}
	}
}
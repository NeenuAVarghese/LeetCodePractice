//"key1=value1&key2=value2"

//# parse("key1=value1&key2=value2") --> {"key1": "value1", "key2": "value2"}
//# parse("") --> {}


import java.util.*;

class TrendMicroAssignment{


	static Map<String, String> parseString(String testStr){


		Map<String, String> mapResult = new HashMap<String, String>();
		

		if(testStr.length() == 0){
			return mapResult;
		}
		

		StringBuilder sb = new StringBuilder();
		char[] charTestStr = testStr.toCharArray();
		String keyVal = "", valueVal = "";

		for(int i = 0; i<charTestStr.length; i++){

			if(charTestStr[i] == '='){
				keyVal = sb.toString();
				sb = new StringBuilder();
				continue;
			}

			if(charTestStr[i] == '&' || i == charTestStr.length - 1){
				if(i == charTestStr.length - 1){
					sb.append(charTestStr[i]);
				}
				valueVal = sb.toString();
				mapResult.put(keyVal, valueVal);
				System.out.println(keyVal + " - " + valueVal);
				sb = new StringBuilder();
				continue;
			}

			sb.append(charTestStr[i]);
		}

		return mapResult;

	}



	public static void main(String args[]){

		String testStr = "key1=value1&key2=value2";

		parseString(testStr);

	}
}



class ReverseString {

    String reverse(String inputString) {
        int startIdx = 0;
        int endIdx = inputString.length()-1;
        char[] output = inputString.toCharArray();
        
        while(startIdx < endIdx) {
        	char temp = output[endIdx];
        	output[endIdx] = output[startIdx];
        	output[startIdx] = temp;
        	
        	startIdx++;
        	endIdx--;
        }
        
        return String.valueOf(output);
    }
  
}
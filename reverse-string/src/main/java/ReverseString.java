class ReverseString {
	
    String reverse(String inputString) {
        char[] output = inputString.toCharArray();
        char temp;
        
        for(int idx = 0, endIdx = inputString.length() - 1; idx < endIdx; idx++, endIdx--) {
        	temp = output[endIdx];
        	output[endIdx] = output[idx];
        	output[idx] = temp;
        }
        
        return String.valueOf(output);
        
        //Could also do the following, but doing above academically
        //return new StringBuilder(inputString).reverse().toString();
    }
  
}
class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String num = Integer.toString(numberToCheck);
		for(int i = 0; i < num.length(); i++) {
			numberToCheck -= Math.pow(Character.getNumericValue(num.charAt(i)), num.length());
		}
		
		//If is an Armstrong number, this will equal 0 as we've subtracted every exponent value
		//in the sequence from the input number
		return numberToCheck == 0;
	}

}

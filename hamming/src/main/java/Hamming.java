class Hamming {
	
	private String left;
	private String right;
	
    Hamming(String leftStrand, String rightStrand) {
    	this.setLeft(leftStrand);
        this.setRight(rightStrand);
        
        //Initialize if null input
        if(this.left == null) {
        	this.left = "";
        }
        if(this.right == null) {
        	this.right = "";
        }
        
        //EXCEPTION: unequal length strands
        if(this.left.length() != this.right.length()){
        	throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
    	int dist = 0;
    	for(int i = 0; i < this.left.length(); i++) {
    		if(this.left.charAt(i) != this.right.charAt(i)) {
    			dist++;
    		}
    	}
    	
    	return dist;
    }

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

}

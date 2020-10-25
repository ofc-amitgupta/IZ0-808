package fieldaccess;

public class Thing {
	
	int numOne ;
	long numTwo;
	
	@Override
	public String toString() {
		return "Thing [numOne=" + numOne + ", numTwo=" + numTwo + "]";
	}
	
	public boolean sameAs(Thing other) {
		return other == this;
		
	}

}

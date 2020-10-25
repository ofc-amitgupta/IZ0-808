package fieldaccess;

public class Main {

	public static void main(String[] args) {
		
		Thing t = new Thing();
		
//		int x = t.numOne = 100;
//		t.numTwo = 200;
//		System.out.println("x : "+x);
//		System.out.println("numOne : " +t.numOne + " numTwo : " + t.numTwo);
		
		Box b = new Box();
//		b.oneThing.numOne=10;
//		System.out.println("numOne : " +b.oneThing.numOne + " numTwo : " + b.oneThing.numTwo);
//		
//		b._OneThing().numOne = 21;
//		System.out.println("--"+b._OneThing().numOne);
		
		System.out.println("---"+b.getManyThings()[0].numOne);
		b.getManyThings()[0].numOne=31;
		System.out.println("---"+b.getManyThings()[0].numOne);
		
		System.out.println("t :" + t.sameAs(t));
	}

}

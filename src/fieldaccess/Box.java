package fieldaccess;

public class Box {
	
	
	public Thing oneThing = new Thing();
	
	private Thing[] things = {new Thing(), new Thing(), new Thing()};
	
	public Thing _OneThing(){
		return things[0];
	}
	
	public Thing[] getManyThings() {
		return things;
		
	}

}

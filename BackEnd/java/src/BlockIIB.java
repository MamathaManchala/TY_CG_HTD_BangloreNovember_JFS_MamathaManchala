
public class BlockIIB {
 
	//final int maximum=3000;initialization
	final int maximum;//declaration//this is used to initialize
	static final double PI;
	
	public BlockIIB(){
		
		System.out.println("constructor is executing");
	}
	public BlockIIB(int a) {
		System.out.println("constructor is overloding");
		
	}
	{
		System.out.println("IIB is executing");
		this.maximum=3000;
	}
	static{
		System.out.println("static block is executing");
		PI=3.14;
	}
}

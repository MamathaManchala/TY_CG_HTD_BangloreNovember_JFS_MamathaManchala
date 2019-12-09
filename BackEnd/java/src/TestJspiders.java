
public class TestJspiders {
	public static void main(String ar[]) {
		
		Jspiders OAR=new Jspiders();
		OAR.swipe();
		OAR.swipe();
		Jspiders BTM=new Jspiders();
		BTM.swipe();
		BTM.swipe();
		BTM.swipe();
		
		System.out.println("students in oar is "
				+ ""+OAR.branchcount);
		System.out.println(BTM.branchcount);
		System.out.println(Jspiders.totcount);
	}

}

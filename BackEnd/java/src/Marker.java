
public class Marker implements Pen {
public void write() {
	System.out.println("write method");
}
public void writing() {
	System.out.println("writing method");
}
public  void wrote() {//directly we can override
	
	System.out.println("hi");
}
//public default  void wrote() {//cannot use default keyword
//	System.out.println("hi");
//}
}

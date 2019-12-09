import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet t1=new TreeSet();//non generic
	
	t1.add(34);
	t1.add(12);
	t1.add(45);
	t1.add(2);
	t1.add(12);
	t1.add(67);
	//t1.add("mammu");//exception //only takes homogeneous//
	//t1.add(null);	//does not use
	t1.remove(34);
	
	for (Object object : t1) {
		System.out.println(object);
	}
}
}

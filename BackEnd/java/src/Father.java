
public class Father {

	Father(){
		//this("mam",23);// constructor recursion
		
		System.out.println("a");
		}
    Father(String name,int age){
    	this();
         System.out.println("b");
        }
}

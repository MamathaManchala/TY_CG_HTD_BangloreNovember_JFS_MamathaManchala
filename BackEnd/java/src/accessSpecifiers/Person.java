package accessSpecifiers;

public class Person {
	private String name;
	 private Person(String name){
		 name=name;
		 //this.name=name;//both ways we can use
		 
	 }
	 private void details() {
		 System.out.println("name is"+name);
	 }

}

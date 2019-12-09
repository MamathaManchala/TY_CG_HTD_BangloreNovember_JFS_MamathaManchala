
public class Person1 {
	
		String name;

		public Person1(String name) {
			super();
			this.name = name;
		}
		@Override
			protected void finalize() throws Throwable {
				
				super.finalize();
				System.out.println("finalize method ");
			}
		public static void main(String[] args) throws Throwable {
			Person p1=new Person("jyo");
			p1.finalize();
			System.out.println(p1.name);
		}
		}




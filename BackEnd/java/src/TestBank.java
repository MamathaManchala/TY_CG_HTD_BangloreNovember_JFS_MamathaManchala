
public class TestBank {
public static void main(String[] args) {
	Atm a1=new Atm();
	Sbi s1=new Sbi();
	Hdfc h1=new Hdfc();
	Icici i1=new Icici();
	
	
	Bank b1=new Bank();
	b1.insertAtm(i1);
}
}

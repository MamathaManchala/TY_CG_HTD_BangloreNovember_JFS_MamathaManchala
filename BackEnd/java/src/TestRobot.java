
public class TestRobot {
public static void main(String[] args) {
	Robot r=new Robot();
	r.move();
	r.sound();
	
	Moment m=new Robot();//runtime polymorphism//upcasting//late binding
	m.move();
	//m.sound();
	
	
	Sound s=new Robot();
	s.sound();
	//s.move();
	
	
}
}

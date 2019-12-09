package checkedExceptions;

public class Student implements Cloneable{//ckeck without imple

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}

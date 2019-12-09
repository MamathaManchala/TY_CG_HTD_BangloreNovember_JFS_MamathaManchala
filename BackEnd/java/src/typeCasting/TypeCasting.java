package typeCasting;

public class TypeCasting {
	
		
	
	
	//implicit typecasting or widening
	
	byte a=5;
	short b=a;
	int c=b;
	float f=c;
	double d=f;
	
	void implicit() {
		
	
	
	System.out.println("byte value is"+a);
	System.out.println("short value is"+b);
	System.out.println("int value is"+c);
	System.out.println("float value is"+f);
	System.out.println("double value is"+d);
	System.out.println("-------------");
	
	}
	
	
	//explicit typecasting or narrowing//loss of data
	
	void explicit() {
		
	
	double e =3.13;
	int p=(int) e;
	
	float q=5.45f;
	byte r=(byte)q;
	
	System.out.println("int value is"+p);
	System.out.println("byte value is"+r);
	
	}
}


class Factorial{

static int factorial(int num)
{
if (num==0){
	return 1;
}
	return num*factorial(num-1);
}
public static void main(String ar[]){

	int result=factorial(5);
	
  System.out.println("value is"+result);
}
}
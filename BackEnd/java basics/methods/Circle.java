class Circle{
 static double areaCircle(int r){
double areaCircle=3.14*r*r;
return areaCircle;
}

static double perimeterCircle(int r){
double perimeterCircle=2*3.14*r;
return perimeterCircle;
}

public static void main (String ar[]){

double result=areaCircle(8);
double result1=perimeterCircle(3);

System.out.println("area is"+result);
System.out.println("perimeter is"+result1);
} 
}
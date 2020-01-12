class Square{

static int areaSquare(int a){
int areaSquare=a*a;
return areaSquare;
}

static int perimeterSquare(int a){
int perimeterSquare=4*a;
return perimeterSquare;
}

public static void main(String args[]){

int a=areaSquare(4);
int b=perimeterSquare(2);

System.out.println("area is"+a);
System.out.println("perimeter id "+b);
}
}
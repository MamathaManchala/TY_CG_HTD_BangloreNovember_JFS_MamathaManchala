class Method{

static void add(int a,int b){
	System.out.println(a+b +"sum is");
}

static void sub(int x, int y){
	System.out.println("sub is"+(x-y));
}

static void mul(int m ,int n){
	System.out.println(m*n);
}

static void div(int a, int b){
	System.out.println(a/b);
}

static void mod(int a,int b){
	System.out.println(a%b);
}

public static void main(String args[]){

add(30,40);
add(12,20);
sub(20,10);
mul(2,5);
div(4,2);
mod(10,2);

}


}
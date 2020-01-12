class ForLoop
{
public static void main(String arr[])
{
for(int i=9;i>=0;i--)
{
if(i==4)
//break;//prints upto 3 values only
continue;//skip 4th value and print next values
System.out.println("value is "+i);
}
}
}
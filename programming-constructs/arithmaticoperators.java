import java.util.Scanner;
class arithmaticoperators{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first no");
int a=sc.nextInt();
System.out.println("Enter second no");
int b=sc.nextInt();
int c=a+b;
int d=a-b;
int e=a*b;
double f=a/b;
int g=a%b;
System.out.println("add = "+c);
System.out.println("diff = "+d);
System.out.println("mul = "+e);
System.out.println("div = "+f);
System.out.println("rem = "+g);

}}
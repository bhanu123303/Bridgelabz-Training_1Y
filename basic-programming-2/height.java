import java.util.Scanner;
class height{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter height in cm");
double a=sc.nextDouble();
double b=.394*a;
double c=a*.032;
System.out.println("height in inches"+b);
System.out.println("height in foot"+c);


}}
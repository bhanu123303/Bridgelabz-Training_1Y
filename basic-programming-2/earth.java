import java.util.Scanner;
class earth{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter radius in km");
int a=sc.nextInt();
double b=a*1.6;
double km=3.14*a*a*a;
double m=3.14*b*b*b;
System.out.println("vol in km3"+km);
System.out.println("vol in miles3"+m);
}}
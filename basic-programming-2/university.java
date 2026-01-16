import java.util.Scanner;
class university{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter fees");
int a=sc.nextInt();
int df=a-((a/100)*10);
System.out.println("fee after discount is"+df);
}}
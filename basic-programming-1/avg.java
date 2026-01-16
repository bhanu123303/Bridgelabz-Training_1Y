import java.util.Scanner;
class average{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter First no");
int a=sc.nextInt();
System.out.println("Enter second no");
int b=sc.nextInt();
System.out.println("Enter third no");
int c=sc.nextInt();
double avg=(a/b/c)/3;
System.out.println("Average "+avg);
}}
import java.util.Scanner;
class Sam{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter maths marks");
int a=sc.nextInt();
System.out.println("enter physics marks");
int b=sc.nextInt();
System.out.println("enter chemistry marks");
int c=sc.nextInt();
double avg=(a+b+c)/3;
System.out.println("average is"+avg);
}}
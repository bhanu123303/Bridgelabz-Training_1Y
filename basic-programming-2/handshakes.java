import java.util.Scanner;
class handshakes{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("no of students");
int a=sc.nextInt();
int b=(a*(a-1))/2;
System.out.println("max no of handshakes"+b);
}}
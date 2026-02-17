class Calculator{
public int add(int a,int b){
return a+b;}
public int sub(int a,int b){
return a-b;}
public int mul(int a,int b){
return a*b;}
public int div(int a,int b){
return a/b;}
public static void main(String args[]){
Calculator c1=new Calculator();
int a=c1.add(10,20);
int b=c1.sub(20,10);
int c=c1.mul(10,20);
int d=c1.div(10,20);
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);}}
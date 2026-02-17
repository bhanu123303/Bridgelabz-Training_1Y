class Calculator{
public int add(int a,int b){
return a+b;}
public int sub(int b,int a){
return a-b;}
public int mul(int a,int b){
return a*b;}
public div(int a,int b){
return a/b;}
public static void main(String args[]){
Calculator c1=new Calculator();
c1.add(10,20);
c1.sub(20,10);
c1.mul(10,20);
c1.div(10,20);
System.out.println(c1.add);
System.out.println(c1.sub);
System.out.println(c1.mul);
System.out.println(c1.div);}}
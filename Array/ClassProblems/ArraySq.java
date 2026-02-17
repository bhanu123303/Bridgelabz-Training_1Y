import java.util.Scanner;
class ArraySq{
public static void main(String args[]){
int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
int row=arr.length;
int cols=arr[0].length;
for(int i=0;i<row;i++){
for(int j=0;j<cols;j++){
System.out.print(arr[i][j]+" ");}
System.out.println("");}
for(int i=0;i<row;i++){
for(int j=0;j<cols;j++){
System.out.print(arr[i][j]*arr[i][j]+" ");}
System.out.println("");}
}}

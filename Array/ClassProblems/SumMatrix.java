import java.util.*;
class SumMatrix{
public static void main(String args[]){
int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
int row=arr1.length;
int col=arr1[0].length;
int arr2[][]={{9,8,7},{6,5,4},{3,2,1}};
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
System.out.print(arr1[i][j]+arr2[i][j]+" ");}
System.out.println("");}


}}

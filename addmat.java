//matrix addition
import java.util.Scanner;
class addmat
{
public static void main(String[] args)
{
int i,j,r1,c1,r2,c2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the row and column size:");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("enter row and column size of second matrix:");
r2=sc.nextInt();
c2=sc.nextInt();
if(r1==r2 && c1==c2){
int mat1[][]=new int[r1][c1];
int mat2[][]=new int[r2][c2];
int  res[][]=new int[r2][c2];
System.out.println("enter the first matrix elements:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++){
mat1[i][j]=sc.nextInt();
}
}
System.out.println("enter the  second matrix elements:");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++){
mat2[i][j]=sc.nextInt();
}
}
for(i=0;i<r1;i++){
for(j=0;i<c1;j++){
res[i][j] = mat1[i][j]+mat2[i][j];
System.out.print(res[i][j]+" ");
}
System.out.println();
}
}
}
}






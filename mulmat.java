//matrix multiplication
import java.util.Scanner;
class mulmat
{
public static void main(String[] args)
{
int i,j,k,r1,c1,r2,c2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the row and column size of first matrix:");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("enter row and column size of second matrix:");
r2=sc.nextInt();
c2=sc.nextInt();
if(c1==r2)
{
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
 for(i=0;i<r1;i++)
 {
  for(j=0;j<c2;j++)
   {
    for(k=0;k<c1;k++)
    {
    res[i][j]=res[i][j]+mat1[i][k]*mat2[k][j];
    
}
System.out.print(res[i][j]+" ");
}
System.out.println();
}
}
}
}

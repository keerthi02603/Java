//sorting 
import java.util.*;
class sort
{
public static void main(String args[])
{
int n,i,j,t;
Scanner sc=new Scanner(System.in);
System.out.print("enter the  n value:");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("enter the elements:");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
//sorting in ascending order
for(i=0;i<=a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
//display
for(i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}


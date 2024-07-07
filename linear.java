//names sorting
import java.util.*;
class linear
{
public static void main(String args[])
{
int i,n,search;
Scanner sc=new Scanner(System.in);
System.out.print("enter the array size:");
n=sc.nextInt();
int a[]=new int[n];
{
System.out.println("enter the array elements:");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter an element to search:");
search=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==search)
{
System.out.println(search +"is present at location"+(i)+" ");
break;
}
}
if(i==n)
System.out.println(search+"is not present in array");
}
}
}

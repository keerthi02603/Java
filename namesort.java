//name sorting
import java.util.*;
class namesort
{
public static void main(String args[])
{
int n,i,j,t;
Scanner sc=new Scanner(System.in);
System.out.print("enter the  length of names:");
n=sc.nextInt();
String str[]=new String[n];
System.out.print("enter the names:");
for(i=0;i<n;i++)
{
str[i]=new String(sc.next());
}
//sorting in ascending order
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(str[i].compareTo(str[j])>0)
{
String temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println("sorted list of names is:");
for(i=0;i<n;i++)
{
System.out.println(str[i]);
}
}
}



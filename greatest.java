import java.util.*;
class greatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,n3,n4,n5,greatest,smallest;
System.out.println("enter the values of the n");
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n4=sc.nextInt();
n5=sc.nextInt();
greatest=n1;
smallest=n1;
if(n2>greatest)
greatest=n2;
if(n3>greatest)
greatest=n3;
if(n4>greatest)
greatest=n4;
if(n5>greatest)
greatest=n5;
if(n2<smallest)
smallest=n2;
if(n3<smallest)
smallest=n3;
if(n4<smallest)
smallest=n4;
if(n5<smallest)
smallest=n5;
System.out.println("greatest number is:"+greatest);
System.out.println("smallest number is:"+smallest);
}}

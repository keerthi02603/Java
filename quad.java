import java.util.*;
//import java.lang.Math;
class quad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
double r1,r2;
System.out.println("enter the r1 and r2:");
r1=sc.nextInt();
r2=sc.nextInt();
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=(int)Math.sqrt(b*b-(4*a*c));
if(d>0)
{
r1=(-b+d)/(2*a);
r2=(-b-d)/(2*a);
System.out.println("the real root r1 :"+r1+"and the root r2 is:"+r2);
}
else if(d<0)
{
r1=(-b+d)/(2*a);
r2=(-b-d)/(2*a);
System.out.println("roots imaginary r1 :"+r1+"and the root r2 is:"+r2);
}
else
{
d=(int)Math.sqrt(b*b-(4*a*c));
r1=(-b+d)/(2*a);
System.out.println("roots equal r1 :"+r1+"and the root r2 is:"+r1);
}}}






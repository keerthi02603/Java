import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1,n,j;
System.out.println("enter the value of n");
n=sc.nextInt();
for(i=2;i<=n;i++)
{
int c=0;
if(n%i==0)
{
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}}
if(c<3&&c!=0)
System.out.println( i );
}}}







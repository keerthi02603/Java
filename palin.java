import java.util.*;
class palin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rem=0,rev=0,temp,n;
System.out.println("enter the value of n");
n=sc.nextInt();
temp=n;
while(n!=0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(rev==temp)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}}}

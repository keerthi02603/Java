//strings
import java.util.Scanner;
class alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentence:");
String s1=sc.nextLine();
System.out.println("enter the alphabet:");
int vowels=0;
int c=0;
for(int i=0;i<s1.length;i++)
{
if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
{
vowels++;
}
else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
{
c++;
}
}
System.out.println("vowels="+vowels);
System.out.println("consonents="+c);
}
}


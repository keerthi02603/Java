//strings
import java.util.*;
class compare
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first string:");
String s1=sc.nextLine();
//System.out.println("enter what you want in that string");
char A=sc.next().toLowerCase().charAt(0);
int count=0;
//String s1=sc.nextLine().toLowerCase();
//String s1=sc.nextLine().toUpperCase();
//System.out.println("enter the second string:");
//string s2=sc.nextLine();
//s1.compareTo(s2);
//System.out.println(s1.compareTo(s2));
//System.out.println(s1.equals(s2));
//System.out.print(s1.equalsIgnoreCase(s2));
//System.out.println(s1.indexOf("a"));
//System.out.println(s1.concat(s2));
//System.out.println(s1);
//System.out.println(s1.length());
System.out.println("enter the alphabet:");
int vowel=0;
int c=0;
for(int i=0;i<s1.length;i++){
if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||S1.charAt(i)=='u')
{
vowels++;
}
else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
{
c++;
}
}
System.out.println("vowels="+vowel);
System.out.println("consonents="+c);
}
}
/*for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)==A)
{
count++;
}
}
System.out.println("Count="+count);
}
}*/


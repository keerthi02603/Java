import java.util.Scanner;
class charec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentence");
String s1=sc.nextLine().toLowerCase();
String rev=" ";
for(int i=0;i<s1.length();i++)
{
rev=s1.charAt(i)+rev;
}
System.out.print(rev);
}
}

import java.util.Scanner;
class fn
{
public static void main(String args[])
{
String sen;
Scanner in = new Scanner(System.in);
System.out.println("enter your sentence");
sen = in.nextLine();
int vow=0, con=0,digits=0,spaces=0;
char ch;
sen=sen.toLowerCase();
for(int i = 0; i < sen.length(); ++i)
{
ch = sen.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U')
{
++vow;
System.out.println("Vowels: " +vow);
}
else if((ch >= 'a' && ch <= 'z'))
{
++con;
System.out.println("Consonants: " +con);
}
else if(ch >= '0' && ch <= '9')
{
++digits;
} 
else if(ch == ' ')
{
++spaces;
}
}
System.out.println("Vowels: " +vow);
System.out.println("Consonants: " +con);
System.out.println("Digits: " +digits);
System.out.println("White spaces: " +spaces);
}
}


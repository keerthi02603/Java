//static variable example
import java.util.*;
class student
{
int marks;
String name;
static String college="parul";
student(String n,int m)
{
name=n;
marks=m;
}
void display()
{
System.out.println(name+" "+marks+" "+college);
}
public static void main(String args[])
{
student s1=new student("ammu",99);
student s2=new student("uma",99);
student s3=new student("rishi",99);
s1.display();
s2.display();
s3.display();
}
}

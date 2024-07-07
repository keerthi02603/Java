//program based on this keyword
import java.util.*;
class emp
{
int emp_id;
String name;
double salary;
String company;
void insertval(int emp_id,String name,double salary,String company)
{
this.emp_id=emp_id;
this.name=name;
this.salary=salary;
this.company=company;
}
void display()
{
System.out.println(emp_id+" "+name+" "+salary+" "+company);
}
public static void main(String args[])
{
emp t=new emp();
t.insertval(3,"ammu",3000000.325,"wipro");
t.display();
}
}

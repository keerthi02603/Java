import java.util.*;
class Employee
{
int Emp_age;
String  Emp_name;
float Emp_float;
String Emp_gender;
String Emp_address;
int n,i;
void details(String n,int a,String g,int s,String ad,String d)
{
Emp_name=n;
Emp_age=a;
Emp_gender=g;
Emp_designation=d;
Emp_address=ad;
}
void show()
{
System.out.println(Emp_name+" "+Emp_age+" "+Emp_gender+" "+Emp_designation+" "+Emp_address);
}
}
class one{
public static void main(String...args)
{
String E1;
String E2;
Employee E1=new Employee();
Employee E2=new Employee();
E1.details("hari",20,"female","manager",1000000,"hyderabad");
E2.details("geetha",20,"male","manager",1000000,"secundrabad");
E2.show();
E1.show();
}
}




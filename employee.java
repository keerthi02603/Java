//super keyword example
import java.util.*;
class employee
{
String name="ammu";
int emp_id=3;
}
class c extends employee
{
String name="wipro";
int  emp_id=325;
void display()
{
System.out.println(name);
System.out.println(super.name);
System.out.println(emp_id);
System.out.println(super.emp_id);
}
}
class b
{
public static void main(String args[])
{
c s=new c();
s.display();
}
}


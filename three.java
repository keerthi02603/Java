class chan
{
int age=19;
void change_age(int age)
{
age=age+10;// cahnges will be done in the local variable only
System.out.println("age in local:"+age);
}
public static void main(String aa [])
{
chan c=new chan();
System.out.println("age before change:"+c.age);
c.change_age(10);
System.out.println("age after change"+c.age);
}
}

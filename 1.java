class Employee{
String Emp_name;
int Emp_age;
String Emp_gender;
String Emp_designation;
int Emp_salary;
String Emp_Address;

void details(String n,int a,String g,String d,int s,String ad){
Emp_name=n;
Emp_age=a;
Emp_gender=g;
Emp_designation=d;
Emp_salary=s;
Emp_Address=ad;
}
void Show(){
System.out.println(Emp_name+" "+Emp_age+" "+Emp_gender+" "+Emp_designation+" "+Emp_salary+" "+Emp_Address);
}
}
class One{
public static void main(String[] args){
Employee E1=new Employee();
Employee E2=new Employee();
E1.details("geetha",20,"female","Manager",10000000,"Miyapur");
E2.details("ammu",20,"female","HR recruter",1000000,"Khammam");
E2.Show();
E1.Show();
}
}


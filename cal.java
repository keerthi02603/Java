//simple calculator
import java.util.*;
class  ammu{
public static void main(String args[]){
char operator;
int n1,n2,result=0;
Scanner input=new Scanner(System.in);
System.out.println("choose an operator: +,-,*,/");
operator=input.next().charAt(0);
System.out.print("enter the first number:");
n1=input.nextInt();
System.out.print("enter the second number:");
n2=input.nextInt();
switch(operator){
case '+':
result=n1+n2;
System.out.println(n1+"+"+n2+"="+result);
break;
case '-':
result=n1-n2;
System.out.println(n1+"-"+n2+"="+result);
break;
case '*':
result=n1*n2;
System.out.println(n1+"*"+n2+"="+result);
break;
case '/':
result=n1/n2;
System.out.println(n1+"/"+n2+"="+result);
break;
default:
System.out.println("entered operator is not valid");
}
}
}

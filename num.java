import java.util.*;
public class num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[] num=new int[5];
int currentIndex=0;
System.out.println("enter 5 numbers between 10 and 100 (inclusive):");
for(int i=0;i<5;i++)
{
int newNum;
do
{
System.out.print("Number "+(i+1)+":");
newNum=sc.nextInt();
}
while(newNum<10||newNum>100);
if(!contains(num,currentIndex,newNum)){
num[currentIndex++]=newNum;
displayvalues(num,currentIndex);
}
else
{
System.out.println("duplicate ignoring the duplicate number.");
i--;
}
}
System.out.println("final set of values:");
displayvalues(num,currentIndex);
sc.close();
}
private static boolean contains(int[] array,int length,int value)
{
for(int i=0;i<length;i++)
{
if(array[i]==value)
{
return true;
}
}
return false;
}
private static void main(String args[])
{
 displayvalues(int[] array,int length);
System.out.print("values:");
for(int i=0;i<length;i++)
{
System.out.println(array[i]+" ");
}
}
}


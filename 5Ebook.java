import java.util.*;
import java.io.*;
class Ebook
{
 
public static void main(String[] ar)
{
 String bname,bauth,cadd,cname;
 int bcount,cid,total_count,rem_count;
 Scanner M=new Scanner(System.in);
 Ebook e=new Ebook();
 int n,i;
System.out.println("enter no.books in a BOOK STALL");
n=M.nextInt();
int a[]=new int[n];
//System.out.println("enter no.books in a BOOK STALL");
//n=M.nextInt();
for(i=1;i<=n;i++)
{
System.out.println("enter details of book "+i);
 System.out.println("enter the book name");
 bname=M.next();
 System.out.println("enter the book author name");
 bauth=M.next();
 System.out.println("enter the customer name");
 cname=M.next();
 System.out.println("enter customer id");
 cid=M.nextInt();
 System.out.println("enter customer ADDRESS");
 cadd=M.nextLine();
 M.nextLine();
 System.out.println("enter the count of books which customer want to buy");
 bcount=M.nextInt();
 System.out.println("enter the total count of books");
 total_count=M.nextInt();
 rem_count=total_count-bcount;
 System.out.println("remaining no.of books="+rem_count);
 System.out.print("book name:"+bname+"\n");
 System.out.println();
 }
 }}

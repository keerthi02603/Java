//books
class book
{
private String bookname;
private String bookauthor;
private int bookcount;
public book(String bookname,String bookauthor,int bookcount);
this.bookname=bookname;
this.bookauthor=bookauthor;
this.bookcount=bookcount;
public String getbookname()
{
return bookname;
}
public int getbookcount()
{
return bookcount;
}
public void decreasebook()
{
if(bookcount>0)
{
bookcount--;
}
}
}
class customer
{
private int customerid;
private String customername;
private String customeraddress;
public customer(int customer id,int String customer name,String customer address)
{
this.customer id=customerid;
this.customer name=customername;
this.customer address=customeraddress;
}
}
public void displaydetails()
{
System.out.println("available books:");
for(int i=0;i<bookcount;i++)
System.out.println(book[i].getbookname()+"\n "+getbookauthor+" "+getbookcount);


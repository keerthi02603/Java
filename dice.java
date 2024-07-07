//dice
import java.util.Random;
public class dice
{
public static void main(String[] args)
{
int NumberofAttempts = 10;
int SuccessfulAttempts =0;
for(int i=0;i<NumberofAttempts;i++)
{
int dice1=dice();
int dice2=dice();
System.out.println("Attempt"+(i+1)+":dice1="+dice1+",dice2="+dice2);
if(dice1==dice2)
{
SuccessfulAttempts++;
System.out.println("success! same values on both dice.");
}
try{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
System.out.println("total Successful Attempts:"+SuccessfulAttempts);
}
private static int dice()
{
Random random=new Random();
return random.nextInt(6)+1;
}
}


import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
      int res=gcdb(a,b);
      int min,gcd=0;
      if(res>c)
      {
      min=c;
       
      }
      else
      {
      min=res;
       
      }
     while(min>=1)
      {
     if((res%min==0)&&(c%min==0))
     {
     gcd=min;
       break;
     }
       min--;
      }
    //return gcd;
 
System.out.println(gcd);
	}
  public static int gcdb(int a,int b)
  {
   int min,gcd=0;
      if(a>b)
      {
      min=b;
       
      }
      else
      {
      min=a;
       
      }
     while(min>=1)
      {
     if((a%min==0)&&(b%min==0))
     {
     gcd=min;
       break;
     }
       min--;
      }
    return gcd;
  }
}
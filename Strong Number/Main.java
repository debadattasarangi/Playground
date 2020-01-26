import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n;
      int a,i,sum=0,fact=1;
      while(n>0)
      {
      a=n%10;
        n=n/10;
        for(i=1;i<=a;i++)
        {
        fact=fact*i;
        }
        sum=sum+fact;
        fact=1;
      }
     // System.out.println(sum);
      if(n1==sum)
      {
      System.out.println("Yes");
      }
      else
         {
      System.out.println("No");
      }
	}
}
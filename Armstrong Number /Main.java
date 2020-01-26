import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n;
      int sum=0;
      int k;
      while(n>0)
      {
      k=n%10;
        n=n/10;
        sum=sum+k*k*k;
      }
      if(n1==sum)
      {
      System.out.println("Armstrong Number");
      }
      else{
      System.out.println("Not a Armstrong Number");
      }
    }
}
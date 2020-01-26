import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a;
     // int o=n/2;
      for(a=1;a<=n;a++)
      {
      if(n%a==0)
      {
        System.out.println(a);
      }
      }
	}
}
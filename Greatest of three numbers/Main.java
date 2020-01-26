import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int o=sc.nextInt();
      int p=sc.nextInt();
      if(n>o && n>p)
      {
      System.out.println(n);
      }
      else if(o>p && o>n)
      {
      System.out.println();
      }
      else
      {
      System.out.println(p);
      }
      
    }
}
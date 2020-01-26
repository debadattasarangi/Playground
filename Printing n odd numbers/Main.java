import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1,j=1;
      for(;j<=n;j++)
      {
        System.out.println(i);
        i=i+2;
      }
	}
}
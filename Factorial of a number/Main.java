import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int i,j=1;
      for(i=1;i<=n;i++)
      {
      j=i*j;
      }
      System.out.println(j);
    }
}
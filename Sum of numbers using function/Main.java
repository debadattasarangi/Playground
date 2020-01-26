import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int res=add(n);
      System.out.println(res);
	}
  public static int add(int m)
  {
  int i=0,sum=0;
    for(;i<=m;i++)
    {
    sum=sum+i;
    }
    return sum;
  }
}
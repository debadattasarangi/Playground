import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int res=squ(n);
      System.out.println(res);
	} 
  public static int squ(int m)
  {
  int r=m*m;
    return r;
  }
}